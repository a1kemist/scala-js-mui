import sbt._

val commonSettings = Seq(
    name := "scala-js-mui",
    scalaVersion := "2.12.8",
    organization := "com.keme",
    homepage := Some(url("https://github.com/Myrddin27/scala-js-mui")),
    licenses := ("Apache-2.0", url("http://opensource.org/licenses/Apache-2.0")) :: Nil
)

val npmSettings = Seq(
    useYarn := true
)

val publicationSettings  = Seq(
    publishTo := {
        val nexus = "https://oss.sonatype.org/"
        if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
        else Some("releases"  at nexus + "service/local/staging/deploy/maven2")
    },
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
        </developers>
)

val releaseSettings = Seq(
    gpgCommand := "gpg2",
    releaseUseGlobalVersion := false,
    releaseVersionFile := file(name.value + "/version.sbt"),
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
        version := "0.1.0-SNAPSHOT",
        libraryDependencies ++= Dependencies.core.value,
        npmDependencies in Compile ++= Dependencies.coreJs,
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
        version := "0.1.0-SNAPSHOT",
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
                    s"""package com.keme.scalajs.mui.icons
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