package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark02_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 算子 - 转换 -
    val rdd: RDD[Int] = sc.makeRDD(
      List(1, 2, 3, 4, 5), 2          // 指定numSlice为2  不是具体的分区数.是希望吧数字分成两组
    )
    val rdd1: RDD[Int] = rdd.mapPartitions(
      list => {
        println("************")
        list.map(_ * 2)
      }
    )
    rdd1.collect().foreach(println(_))


    rdd1.saveAsTextFile("output1")
    sc.stop()
  }


}
