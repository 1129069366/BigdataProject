package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark05_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 算子 - 转换 - glom
    val rdd = sc.makeRDD(
      List(1, 2, 3, 4, 5, 6), 2
    )
    val rdd1: RDD[Array[Int]] = rdd.glom()  // 分成了两个数组

    rdd1.collect().foreach(arr=>println(arr.mkString(",")))

    sc.stop()
  }

}
