name := "TestProject"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.1.11",
  "com.typesafe.akka" %% "akka-stream" % "2.6.3",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.11",
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.3" % Test,
  "com.typesafe.akka" %% "akka-http-testkit" % "10.1.11" % Test,
  "com.typesafe.akka" %% "akka-testkit" % "2.6.3" % Test,
  "org.scalatest" %% "scalatest" % "3.2.0-M1" % Test,
  "org.scalatestplus" %% "scalatestplus-mockito" % "1.0.0-M2" % Test,
  "org.mockito" % "mockito-core" % "3.0.0" % Test
)