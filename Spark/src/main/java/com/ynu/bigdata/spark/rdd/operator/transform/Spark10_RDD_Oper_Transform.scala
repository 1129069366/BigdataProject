package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark10_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 算子 - 转换 - 缩减分区
    val rdd : RDD[Int] = sc.makeRDD(
      List(1,2,3,4,5,6), 3
    )

    // 缩减 (合并)， 默认情况下，缩减分区不会shuffle。没有打乱数据，只是重新组合了而已。   靠的是Executor的首选位置
    // val rdd1: RDD[Int] = rdd.coalesce(2)  // 这种方式在某些情况下，无法解决数据倾斜问题，所以还可以在缩减分区的同时，进行数据的shuffle操作

//    rdd.saveAsTextFile("output")
//    rdd1.saveAsTextFile("output1")

    // 可以在缩减分区的同时，进行数据的shuffle操作。第二个参数设置为true即可。
    val rdd1: RDD[Int] = rdd.coalesce(2,true)
    rdd.saveAsTextFile("output")
    rdd1.saveAsTextFile("output1")



    sc.stop()


  }
}
