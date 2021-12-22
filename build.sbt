import ai.kien.python.Python

lazy val python = Python()

lazy val javaOpts = python.scalapyProperties.get.map {
  case (k, v) => s"""-D$k=$v"""
}.toSeq

lazy val root = project
  .in(file("."))
  .settings(
    name := "scalapy-native-issue-repro",
    version := "0.1.0",
    fork := true,
    scalaVersion := "3.1.0",
    libraryDependencies += "me.shadaj" %% "scalapy-core" % "0.5.1+1-a19bda77"
  )
