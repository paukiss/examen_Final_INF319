import org.apache.spark.streaming.Seconds 
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.dstream.ReceiverInputDStream 

val streamingContext: StreamingContext = new StreamingContext(sc, Seconds(20))

val lines: ReceiverInputDStream[String] = streamingContext.socketTextStream("localhost", 9999)