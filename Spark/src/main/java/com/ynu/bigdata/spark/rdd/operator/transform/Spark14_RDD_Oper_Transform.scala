package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object Spark14_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 算子 - 转换 - reduceByKey
    val rdd : RDD[(String, Int)] = sc.makeRDD(
      List(
        ("a", 1),
        ("a", 1),
        ("a", 1),
        ("a", 1)
      )
    )

    val wordCount:RDD[(String,Int)] = rdd.reduceByKey(_+_)
    wordCount.collect().foreach(println(_))


    sc.stop()
  }

}
