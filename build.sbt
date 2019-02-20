import sbt._

scalaVersion := "2.12.8"

val commonSettings = Seq(
    scalaVersion := "2.12.8"
)

val npmSettings = Seq(
    useYarn := true
)

val publicationSettings  = Seq(
    description := "ScalaJs Facade for Material UI",
    developers := List(
        Developer(
            id = "Myrddin27",
            name = "Logan Nelson",
            email = "lsnelson33@gmail.com",
            url = url("https://github.com/Myrddin27")
        ),
        Developer(
            id = "JustinWomack",
            name = "Justin Womack",
            email = "JustinWomack@users.noreply.github.com",
            url = url("https://github.com/JustinWomack")
        )
    ),
    homepage := Some(url("https://github.com/Myrddin27/scala-js-mui")),
    licenses := ("Apache-2.0", url("http://opensource.org/licenses/Apache-2.0")) :: Nil,
    organization := "com.kemesoft",
    organizationName := "kemesoft",
    organizationHomepage := Some(url("http://www.kemesoft.com/")),
    homepage := Some(url("https://github.com/Myrddin27/scala-js-mui")),
    pomExtra :=
        <scm>
            <connection>scm:git:github.com/Myrddin27!/scala-js-mui</connection>
            <developerConnection>scm:git:git@github.com:Myrddin27/scala-js-mui.git</developerConnection>
            <url>github.com:Myrddin27/scala-js-mui.git</url>
        </scm>
        <developers>
            <developer>
                <id>Myrddin27</id>
                <name>Logan Nelson</name>
            </developer>
            <developer>
                <id>JustinWomack</id>
                <name>Justin Womack</name>
            </developer>
        </developers>,
    // Remove all additional repository other than Maven Central from POM
    pomIncludeRepository := { _ => false },
    publishMavenStyle := true,
    publishTo := {
        val nexus = "https://oss.sonatype.org/"
        if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
        else Some("releases"  at nexus + "service/local/staging/deploy/maven2")
    },
    scmInfo := Some(
        ScmInfo(
            url("https://github.com/Myrddin27/scala-js-mui"),
            "scm:git@github.com:Myrddin27/scala-js-mui.git"
        )
    )

)

val releaseSettings = Seq(
    gpgCommand := "gpg2",
    releaseUseGlobalVersion := false,
    releaseVersionFile := (baseDirectory.value / "version.sbt"),
    releaseTagName := {
        val versionInThisBuild = (version in ThisBuild).value
        val versionValue = version.value
        s"${name.value}-v${if (releaseUseGlobalVersion.value) versionInThisBuild else versionValue}"
    }
)

lazy val root = (project in file("."))
    .settings(commonSettings: _*)
    .settings(
        aggregate in doc := false
    )
    .aggregate(
        core,
        icons
    )

val core = (project in file("core"))
    .settings(commonSettings: _*)
    .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
    .settings(npmSettings: _*)
    .settings(publicationSettings: _*)
    .settings(releaseSettings: _*)
    .settings(
        name := "scala-js-mui-core",
        libraryDependencies ++= Dependencies.core.value,
        npmDependencies in Compile ++= Dependencies.coreJs,
        sourceGenerators in Compile += Def.task {
            val s = streams.value
            val dir = (sourceManaged in Compile).value
            s.log.info("Installing npm dependencies to generate source files")
            val npmDirectory = (npmInstallDependencies in Compile).value
            // core package
            def generateCorePkgFiles(): Seq[sbt.File] = {
                // ============== COMPONENT CLASS KEYS ==================
                s.log.info(s"Generating component class key enumerations")
                s.log.info("Finding eligible component class key sources...")
                val componentClassDirs = {
                    ((npmDirectory / "node_modules" / "@material-ui" / "core" ) * ("Paper")).filter(f => f.isDirectory && f.getName.charAt(0).isUpper)
                }

                val corePkg = organization.value.split(".").foldLeft(dir)(_ / _) / "scalajs"/ "mui" / "core"

                s.log.info(s"Creating output folder ${corePkg.getPath}")
                IO.createDirectory(corePkg)

                import org.scalajs.tools.tsimporter.TypeScriptImporterPlugin.importTsFileImpl
                val parsedComponentClassDefs: Seq[File] = componentClassDirs.get.flatMap(f => {
                    s.log.info(f.getPath)
                    val typeScriptDefinitions = f * ("*.d.ts" -- "index.*")
                    val (errors, parsedFiles): (Seq[String], Seq[File]) = {
                        val (lefts, rights) = typeScriptDefinitions.get.map(tsFile => {
                            s.log.info(s"typeScriptFile => ${tsFile.getName}")
                            val outFile: sbt.File = corePkg / s"Mui${f.getName}.ts.scala"
                            val outputFileName: String = outFile.getName
                            // call ts importer here
                            // if successful, return that file Right(file) or Left(error)
                            importTsFileImpl(tsFile.getPath, outFile.getPath, corePkg.getPath)
                        }).partition(_.isLeft)
                        (lefts.collect{ case Left(error) => error }, rights.collect{ case Right(parsed) => parsed })
                    }

                    errors.foreach(s.log(_))
                    parsedFiles
                })

                parsedComponentClassDefs ++ Seq()
            }
            
            
            val parsedCoreFiles: Seq[File] = generateCorePkgFiles()
            
            // core/colors package
            def generateColorsPkgFiles(): Seq[sbt.File] = {
                val colorsPkg: File = organization.value.split(".").foldLeft(dir)(_ / _) / "scalajs" / "mui" / "core" / "colors"
                // =========== COLORS ================/
                s.log.info("Generating colors")
                s.log.info("Finding eligible color sources...")
                val colorSources = {
                    (npmDirectory / "node_modules" / "@material-ui" / "core" / "colors" ) * ("*.js" -- "index.js" -- "index.es.js" -- "common.js")
                }
                s.log.info(s"Creating output folder ${colorsPkg.getPath}")
                IO.createDirectory(colorsPkg)
                s.log.info(s"Generating source file contents...")
                // Iterate through all of the icon source files
                val colorsPkgFile: File = colorsPkg / "package.scala"
                val colorsPkgFileContents: String = colorSources.get.sortBy(_.getName).map(f => {
                    val name = f.getName.stripSuffix(".js")
                    s"""    @JSImport("@material-ui/core/colors/$name", JSImport.Default)
                       |    @js.native
                       |    object $name extends Color
                       |""".stripMargin
                }).mkString(
                    start =
                        """package com.kemesoft.scalajs.mui.core
                          |
                          |import scala.scalajs.js
                          |import scala.scalajs.js.annotation.JSImport
                          |
                          |package object colors {
                          |
                          |""".stripMargin,
                    sep = "\n",
                    end =
                        """
                          |    @JSImport("@material-ui/core/colors/common", JSImport.Default)
                          |    @js.native
                          |    object common extends CommonColors
                          |}
                          |""".stripMargin
                )
                s.log.info(s"Writing source files...")
                IO.write(colorsPkgFile, colorsPkgFileContents)
                Seq(colorsPkgFile)
            }
            
            
            val parsedCoreColorFiles: Seq[File] = generateColorsPkgFiles()
            
            // core/styles pkg
            
            def generateStylesPkgFiles(): Seq[sbt.File] = {
                Seq()
            }
            
            val parsedCoreStylesFiles: Seq[File] = generateStylesPkgFiles()
            
            // total
            
            val totalGenerated: Seq[File] =
                parsedCoreFiles ++
                parsedCoreColorFiles ++
                parsedCoreStylesFiles

            totalGenerated
        }
    )

lazy val genMuiIcons = TaskKey[Seq[File]]("gen-mui-icons")

lazy val icons = (project in file("icons"))
    .settings(commonSettings: _*)
    .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
    .settings(npmSettings: _*)
    .settings(publicationSettings: _*)
    .settings(releaseSettings: _*)
    .settings(
        name := "scala-js-mui-icons",
        // disable publishing the main API jar
        publishArtifact in (Compile, packageDoc) := false,
        libraryDependencies ++= Dependencies.icons.value,
        npmDependencies in Compile ++= Dependencies.iconsJs,
        sourceGenerators in Compile += Def.task {
            val s = streams.value
            val dir = (sourceManaged in Compile).value
            val pkg = dir / "com" / "keme" / "scalajs" / "mui" / "icons"
            s.log.info("Installing npm dependencies to generate source files")
            val npmDirectory = (npmInstallDependencies in Compile).value
            s.log.info("Finding eligible sources...")
            val iconSources = {
                (npmDirectory / "node_modules" / "@material-ui" / "icons" ) * ("*.js" -- "index.js" -- "index.es.js")
            }
            s.log.info(s"Creating output folder ${pkg.getPath}")
            IO.createDirectory(pkg)
            s.log.info(s"Generating source files...")
            // Iterate through all of the icon source files
            val files: Seq[File] = iconSources.get.map(f => {
                val name = f.getName.stripSuffix(".js")
                val file = pkg / s"$name.scala"
                IO.write(
                    file,
                    s"""package com.kemesoft.scalajs.mui.icons
                       |
                       |import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
                       |
                       |import scala.scalajs.js
                       |import scala.scalajs.js.annotation.JSImport
                       |
                       |object $name extends ReactBridgeComponent {
                       |
                       |    override protected lazy val componentValue: js.Object = RawComponent
                       |
                       |    @JSImport("@material-ui/icons/$name", JSImport.Default)
                       |	@js.native
                       |	object RawComponent extends js.Object
                       |
                       |    def apply(classes: js.Object = js.Object(),
                       |	          className: Option[String] = None): WithProps = auto
                       |}
                       |
                     """.stripMargin.trim
                )
                file
            })
            files
        }
    )

// ======================
// Java Compiler Options
// ======================
javacOptions ++= Seq(
    "-source", "1.8",
    "-target", "1.8",
    "-Xlint"
)

// =======================
// Scala Compiler Options
// =======================
scalacOptions in ThisBuild ++= Seq(
    "-target:jvm-1.8",
    "-encoding", "UTF-8",
    "-deprecation", // warning and location for usages of deprecated APIs
    "-feature", // warning and location for usages of features that should be imported explicitly
    "-unchecked", // additional warnings where generated code depends on assumptions
    "-Xlint", // recommended additional warnings
    "-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver
    "-Ywarn-value-discard", // Warn when non-Unit expression results are unused
    "-Ywarn-inaccessible",
    "-Ywarn-dead-code"
)