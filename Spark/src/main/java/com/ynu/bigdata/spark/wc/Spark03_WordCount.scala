package com.ynu.bigdata.spark.wc

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

object Spark03_WordCount {
  def main(args: Array[String]): Unit = {
    // TODO 使用Spark
    val conf: SparkConf = new SparkConf().setMaster("local").setAppName("WordCount")
    val sc = new SparkContext(conf)

    // 读取文件
    val lines: RDD[String] = sc.textFile("data/word.txt")

    val wordToOne: RDD[(String, Int)] = lines.flatMap(_.split(" ")).map(str=>(str,1))

    // 使用聚合函数reduceByKey
    val wordCount: RDD[(String, Int)] = wordToOne.reduceByKey(_+_)
    wordCount.collect().foreach(println)

    sc.stop()
  }
}
