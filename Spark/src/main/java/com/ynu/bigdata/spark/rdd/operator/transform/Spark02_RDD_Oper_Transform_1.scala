package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

object Spark02_RDD_Oper_Transform_1 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    val rdd = sc.makeRDD(
      List(1, 2, 3, 4, 5, 6, 7, 8), 2
    )

    // 获取每个数据分区的最大值,并且将最大值相加
    // 【1，2】【3，4】

    val rdd1 = rdd.mapPartitions(list => {
      List(list.max).iterator
    })
   // 4 + 8为12
    val maxSum = rdd1.collect().sum
    println(s"最大值求和为:${maxSum}")


    sc.stop()
  }

}
