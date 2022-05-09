package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object Spark18_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    val rdd: RDD[(String, Int)] = sc.makeRDD(
      List(
        ("a", 1), ("a", 2), ("b", 3),
        ("b", 4), ("b", 5), ("a", 6)
      ), 2
    )
    val wordCount: RDD[(String, Int)] = rdd.combineByKey(
      num => num,
      (x: Int, y) => {
        x + y
      },
      (x: Int, y: Int) => {
        x + y
      }
    )
    wordCount.collect().foreach(println(_))

    sc.stop()
  }

}
