package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark05_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)


    val rdd: RDD[Int] = sc.makeRDD(
      List(1, 2, 3, 4, 5, 6), 2
    )

    val rdd1: RDD[Int] = rdd.glom().map(_.max)
    println(rdd1.collect().sum)



    sc.stop()
  }

}
