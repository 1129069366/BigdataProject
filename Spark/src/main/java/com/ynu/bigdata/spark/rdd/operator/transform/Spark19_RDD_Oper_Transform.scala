package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object Spark19_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    val rdd = sc.makeRDD(
      List(
        ("a", 1),("a", 2),("b", 4),("c", 3)
      )
    )

    // true表示升序  安装key的顺序升序，和值无关。
    val rddasc: RDD[(String, Int)] = rdd.sortByKey(true)
    rddasc.collect().foreach(println(_))
    // false表示升序  安装key的顺序升序，和值无关。
    val rdddescend: RDD[(String, Int)] = rdd.sortByKey(false)
    rdddescend.collect().foreach(println(_))







    sc.stop()

  }
}
