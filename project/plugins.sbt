logLevel := sbt.Level.Warn

// ScalaJs plugin for sbt cross build projects
// http://www.scala-js.org/doc/project/
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.26")

// ScalaWebJs plugin integrates scalajs pipeline into the build process
// https://github.com/vmunier/sbt-web-scalajs
addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.0.8-0.6")

// ScalaJs Bundler for using and packaging npm dependencies
// https://scalacenter.github.io/scalajs-bundler/
addSbtPlugin("ch.epfl.scala" % "sbt-web-scalajs-bundler" % "0.14.0")