package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object Spark21_RDD_Req {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("Req")
    val sc = new SparkContext(conf)

    // TODO 统计出每一个省份每个广告被点击数量排行的Top3
    val rdd: RDD[String] = sc.textFile("data/agent.log")

    val wordToOne: RDD[((String, String), Int)] = rdd.map(
      lines => {
        val data: Array[String] = lines.split(" ")
        ((data(1), data(4)), 1)
      }
    )
    wordToOne






    sc.stop()
  }
}
