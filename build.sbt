
name := "hera"

organization := "thebigballsteam"

version := "1.0"

lazy val root = project in file(".")

scalaVersion := "2.12.6"

mainClass := Some("core.JumpAndRun")

libraryDependencies ++= Seq(
  "io.grpc" % "grpc-netty" % scalapb.compiler.Version.grpcJavaVersion,
  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion,
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"
)

PB.targets in Compile := Seq(scalapb.gen() -> (sourceManaged in Compile).value)
