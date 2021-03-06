name := "ScalaProject"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(

  "org.scalatest" % "scalatest_2.11" % "3.0.1",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.4",
  "info.cukes" % "cucumber-junit" % "1.2.4",
  "junit" % "junit" % "4.12",
  "com.novocode" % "junit-interface" % "0.10" % "test"
)
