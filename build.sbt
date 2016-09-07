enablePlugins(ScalaJSPlugin)

name := "learn_scalajs"

scalaVersion := "2.11.8"

scalaJSUseRhino in Global := false

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0"
)