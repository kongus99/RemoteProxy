name := "RemoteProxy"

version := "1.0"

scalaVersion := "2.12.2"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.12" % "2.5.6",
  "com.typesafe.akka" % "akka-remote_2.12" % "2.5.6"
)
