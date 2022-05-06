package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object Spark05_RDD_Oper_Transform_1 {
  def main(args: Array[String]): Unit = {


    // 小功能：计算所有分区最大值求和（分区内取最大值，分区间最大值求和）
    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 算子 - 转换 - glom运算
    val rdd : RDD[Int] = sc.makeRDD(List(1,2,3,4,5,6), 2)

    val rdd1: RDD[Array[Int]] = rdd.glom()

    val max_sum: Int = rdd1.map(_.max).collect().sum
    println(max_sum)


    sc.stop()
  }
}
