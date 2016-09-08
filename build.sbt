enablePlugins(ScalaJSPlugin)

name := "learn_scalajs"

scalaVersion := "2.11.8"

scalaJSUseRhino in Global := false

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"

libraryDependencies ++= Seq(
  "be.doeraene" %%% "scalajs-jquery" % "0.9.0"
)