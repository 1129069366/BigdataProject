package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark02_RDD_Oper_Transform_1 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    val rdd: RDD[Int] = sc.makeRDD(
      List(1, 2, 3, 4), 2
    )
    val rdd1: RDD[Int] = rdd.mapPartitions(
      list => {
        val max: Int = list.max
        List(max).iterator
      }
    )
    rdd1.collect().foreach(println)
    sc.stop()
  }

}
