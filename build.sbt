name := "Sakila-Project"

version := "0.1"

scalaVersion := "2.11.12"

resolvers ++= Seq("apache-snapshots" at "http://repository.apache.org/snapshots")

libraryDependencies ++= Seq(
  "org.apache.spark"%%"spark-core"%"2.4.4",
  "org.apache.spark"%%"spark-sql"%"2.4.4",
  "com.sparkjava"%"spark-core"%"2.4",
  "org.apache.spark"%%"spark-hive"%"2.3.4"%"provided")
