package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object Spark12_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    val rdd: RDD[Int] = sc.makeRDD(
      List(1, 2, 3, 4), 2
    )
    val rdd1 : RDD[Int] = sc.makeRDD(
      List(3, 4, 5, 6), 2
    )

    // 交集
    println(rdd.intersection(rdd1).collect().mkString(","))

    // 并集
    println(rdd.union(rdd1).collect().mkString(","))

    // 差集
    println(rdd.subtract(rdd1).collect().mkString(","))



    // 拉链
    val rdd2: RDD[(Int, Int)] = rdd.zip(rdd1)
    rdd2.collect().foreach(println(_))
//    (1,3)
//    (2,4)
//    (3,5)
//    (4,6)


    sc.stop()





  }
}
