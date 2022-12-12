# Examen Final - INF319
## Univ. Sergio Alejandro Paucara Saca

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://github.com/paukiss)

Examen Final de la materia INF319 - Programacion Funcional en la Universidad Mayor de San Andres a cargo del docente Moises Martin Silva Choque.

Gestion II / 2022.

- ⭐Instalar Apache Spark configurar para Scala y Python.💻
- ⭐Documentacion de codigo, Sesiones, Streaming y RDD en Apache Spark💻

## Requisitos
Tener instalado sistema operativo [Ubuntu 22.04.1](https://ubuntu.com/tutorials/install-ubuntu-desktop)

## Caracteristicas
Este proyecto fue generado en:
- Java 11 
- [Apache Spark 3.3.1](https://spark.apache.org/downloads.html)

## Instalacion
### _Instalar Java_ 
Desde la terminal en linux ejecutar las siguiente lineas de comando:
```
$ sudo apt update
$ java -version
$ sudo apt install default-jre
$ java -version
```
Abrir con el editor de texto **nano** el **bashrc** 
```
$ nano ~/.bashrc

```
Agregar la variable de entorno para Java al final del archivo abierto.
```
export JAVA_HOME="/usr/lib/jvm/java-11openjdk-amd64/"
```
### _Instalar Apache Spark_ 
La instalacion se puede realizar bajo las siguientes lineas de comando.
```
$ wget https://dlcdn.apache.org/spark/spark-3.3.1/spark-3.2.1-bin-hadoop3.tgz
$ tar xvf spark-3.3.1-bin-hadoop3.tgz
$ sudo mv spark-3.3.1-bin-hadoop3/ /opt/spark
$ nano ~/.bashrc
```
Se abrira el **bashrc** agregar y guardar al final del archivo las siguientes lineas, para agregar Spark al environment.
```
export SPARK_HOME=/opt/spark
export PATH=$PATH:$SPARK_HOME/bin:$SPARK_HOME/sbin
```
Finalmente activar los cambios desde la terminal.
```
$ source ~/.bashrc
```
## Desarrollo

### _First Start_

Podemos iniciar Apache Spark en master y slave. Para master solo es necesario abrir la terminal y ejecutar la siguiente linea.
```
$ start-master.sh
```

Para **slave** es necesario iniciar primero el master para saber el URL de Spark, en el ejemplo la URL es *spark://sergio-Virtual:7077*
```
$ start-slave.sh spark://sergio-Virtual:7077
```

Iniciar spark con el shell, por defecto se inicia con Scala con la siguiente linea de comando:
```
$ spark-shell
```
Para utilizarlo con Python:
```
$ pyspark
```

### _Second Start_
Se refactorizo el codigo proporcionado por el docente, y se creo scripts para su ejecucion en Scala para Apache Spark

Autor:

[@sergiopaucara](https://github.com/paukiss/)