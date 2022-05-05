package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark03_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 算子 - 转换 -
    val rdd = sc.makeRDD(List(1,2,3,4,5,6), 3)

    val rdd1: RDD[Int] = rdd.mapPartitionsWithIndex(
      (index, list) => {
        index match {
          case 1 => list
          case _ => Nil.iterator
        }
      }
    )
    rdd1.collect().foreach(println(_))


    sc.stop()


  }
}
