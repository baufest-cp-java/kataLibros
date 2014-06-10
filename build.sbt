import de.johoop.jacoco4sbt._
import JacocoPlugin._

name := "KataLibro"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

libraryDependencies += "com.googlecode.jmockit" % "jmockit" % "1.7"

libraryDependencies += "com.sun.jersey" % "jersey-client" % "1.8"

libraryDependencies += "com.sun.jersey" % "jersey-server" % "1.8"

libraryDependencies += "com.sun.jersey" % "jersey-json" % "1.8"

play.Project.playJavaSettings

sonarSettings

sonarProperties := sonarProperties.value ++ Map("sonar.projectName" -> "KataLibros main", "sonar.projectKey" -> "katalibrosmain")

jacoco.settings

itJacoco.settings
