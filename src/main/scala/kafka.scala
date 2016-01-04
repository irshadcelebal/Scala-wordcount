import org.apache.kafka.clients.producer.{KafkaProducer,ProducerRecord}
//import kafka.serializer.StringDecoder
import org.apache.spark.streaming._
import org.apache.spark.streaming.kafka._
import org.apache.spark.SparkConf

object kafka{
def main(args: Array[String]) {
if (args.length < 2) {
System.err.println("error")
System.exit(1)
}

val Array(brokers, topics) = args
// Create context with 2 second batch interval

val sparkConf = new SparkConf().setAppName("WordCount")

val ssc = new StreamingContext(sparkConf, Seconds(10))
// Create direct kafka stream with brokers and topics

val topicsSet = topics.split(",").toSet
val kafkaParams = Map[String, String]("metadata.broker.list" -> brokers)
//val messages = KafkaUtils.createDirectStream[String, String, StringDecoder, StringDecoder](ssc, kafkaParams, topicsSet)
// Get the lines, split them into words, count the words and print

//val textFile = sc.textFile("playtennis.txt",1).flatMap(line => ////line.split(" ")).map(word => (word, 1)).reduceByKey(_ + _) 
//textFile.print()
// Start the computation

ssc.start()
ssc.awaitTermination()
}
}
