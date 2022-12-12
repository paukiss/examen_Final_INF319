val cadenas = Array("Docentes", "inteligenciaArtificial", "quefinal")

val cadenasRDD = sc.parallelize(cadenas)

cadenasRDD.collect()

val filtro = cadenasRDD.filter(line => line.contains("quefinal"))

val fileNotFound = sc.textFile("/7añljdlsjd/alkls/", 6)

fileNotFound.collect()