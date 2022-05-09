package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{HashPartitioner, SparkConf, SparkContext}


object Spark13_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    val rdd: RDD[Int] = sc.makeRDD(
      List(1, 2, 3, 4, 5, 6), 2
    )
    rdd.saveAsTextFile("output")

    val rdd1: RDD[(Int,Int)] = rdd.map((_,1))
    val rdd2: RDD[(Int, Int)] = rdd1.partitionBy(new HashPartitioner(2))

    rdd2.saveAsTextFile("output1")

    sc.stop()

  }

}
