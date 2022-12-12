import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.Dataset 
import org.apache.spark.sql.DataFrame 

val spark: SparkSession = SparkSession.builder()
    .master("local[*]")
    .appName("simple-app")
    .getOrCreate()

val dataSet: Dataset[String] = spark.read.textFile("textfile.csv")

val df: DataFrame = dataSet.toDF()
df.show()