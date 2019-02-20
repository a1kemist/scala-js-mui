logLevel := sbt.Level.Warn

// ScalaJs plugin for sbt cross build projects
// http://www.scala-js.org/doc/project/
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.26")

addSbtPlugin("org.scalajs.tools" % "scala-js-ts-importer-plugin" % "0.1.0-SNAPSHOT")

// ScalaWebJs plugin integrates scalajs pipeline into the build process
// https://github.com/vmunier/sbt-web-scalajs
addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.0.8-0.6")

// ScalaJs Bundler for using and packaging npm dependencies
// https://scalacenter.github.io/scalajs-bundler/
addSbtPlugin("ch.epfl.scala" % "sbt-web-scalajs-bundler" % "0.14.0")

// Sbt PGP plugin provides PGP signing for SBT 0.12+
// https://github.com/sbt/sbt-pgp
addSbtPlugin("io.crashbox" % "sbt-gpg" % "0.2.0")

// Sbt Release plugin for handling the release process
// https://github.com/sbt/sbt-release
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")

dependencyOverrides ++= Seq(
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.1",
    )

libraryDependencies ++= Seq(
    "org.scalajs.tools" %% "scala-js-ts-importer" % "0.1.0-SNAPSHOT",
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.1",
    )