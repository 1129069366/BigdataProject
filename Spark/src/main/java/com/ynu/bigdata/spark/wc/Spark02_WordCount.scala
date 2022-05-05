package com.ynu.bigdata.spark.wc

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark02_WordCount {
  def main(args: Array[String]): Unit = {

    // TODO 使用Spark
    val conf: SparkConf = new SparkConf().setMaster("local").setAppName("WordCount")
    val sc = new SparkContext(conf)

    // 读取文件
    val lines: RDD[String] = sc.textFile("data/word.txt")

    val wordCountpre: RDD[(String, (String, Int))] = lines.flatMap(_.split(" ")).map(str => (str, 1)).groupBy(_._1).mapValues(
      list => {
        list.reduce(
          (t1, t2) => {
            (t1._1, t1._2 + t2._2)
          }
        )
      }
    )

    val wordCount: RDD[(String, Int)] = wordCountpre.map(_._2)
    wordCount.collect().foreach(println(_))

    sc.stop()



  }
}
