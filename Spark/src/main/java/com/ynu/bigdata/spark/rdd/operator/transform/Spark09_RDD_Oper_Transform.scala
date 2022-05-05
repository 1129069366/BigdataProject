package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark09_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    conf.set("spark.local.dir", "e:/test")
    val sc = new SparkContext(conf)

    val rdd1: RDD[Int] = sc.makeRDD(
      List(1, 1, 1, 1)
    )

    val rdd2: RDD[Int] = rdd1.distinct()
    rdd2.collect().foreach(println(_))



    sc.stop()
  }


}
