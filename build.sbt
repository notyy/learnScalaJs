enablePlugins(ScalaJSPlugin)

name := "learn_scalajs"

scalaVersion := "2.12.3"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

scalaJSUseRhino in Global := false

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"

//libraryDependencies ++= Seq(
//  "be.doeraene" %%% "scalajs-jquery" % "0.9.0",
//  "com.lihaoyi" %%% "utest" % "0.3.0" % "test",
//  "org.scala-lang" % "scala-reflect" % "2.11.8"
//)

testFrameworks += new TestFramework("utest.runner.Framework")