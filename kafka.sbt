name := "kafka"

version := "1.0"
 
scalaVersion := "2.11.7"
 
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.5.2"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.5.2"

libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka" % "1.5.2"

libraryDependencies += "org.apache.kafka" % "kafka_2.11" % "0.8.2.2"


