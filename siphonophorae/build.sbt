import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "me.kerfume"

lazy val frontendBackend = (project in file("frontend-backend"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "frontend-backend",
    libraryDependencies += scalaTest % Test,
    scalaJSModuleKind := ModuleKind.CommonJSModule,
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %%% "scala-parser-combinators" % "1.1.1",
      "org.typelevel" %%% "cats-core" % "1.6.0",
      "org.typelevel" %%% "cats-free" % "1.6.0",
      "io.monix" %%% "monix" % "3.0.0-RC2",
      "org.scalaz" %%% "scalaz-zio" % "1.0-RC1"
    ),
    scalacOptions ++= Seq(
      "-P:scalajs:sjsDefinedByDefault"
    )
  )