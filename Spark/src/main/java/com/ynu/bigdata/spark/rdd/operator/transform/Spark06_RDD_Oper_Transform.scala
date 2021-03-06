package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object Spark06_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
//    conf.set("spark.local.dir", "d:/test")
    val sc = new SparkContext(conf)

    // TODO 算子 - filter
    val rdd : RDD[Int] = sc.makeRDD(List(1,2,3,4,5,6))
    val rdd1: RDD[Int] = rdd.filter(_%2==0)

    rdd1.collect().foreach(println(_))

    sc.stop()

  }
}
