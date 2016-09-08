enablePlugins(ScalaJSPlugin)

name := "learn_scalajs"

scalaVersion := "2.11.8"

scalaJSUseRhino in Global := false

jsDependencies += RuntimeDOM

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"

persistLauncher in Compile := true

persistLauncher in Test := false

libraryDependencies ++= Seq(
  "be.doeraene" %%% "scalajs-jquery" % "0.9.0",
  "com.lihaoyi" %%% "utest" % "0.3.0" % "test",
  "org.scala-lang" % "scala-reflect" % "2.11.8"
)

testFrameworks += new TestFramework("utest.runner.Framework")