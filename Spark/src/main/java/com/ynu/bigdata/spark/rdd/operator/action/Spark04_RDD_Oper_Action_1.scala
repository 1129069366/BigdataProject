package com.ynu.bigdata.spark.rdd.operator.action

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object Spark04_RDD_Oper_Action_1 {
  def main(args: Array[String]): Unit = {

    // 一个应用程序, Driver程序
    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 算子 - 行动
//    val rdd = sc.makeRDD(List(
//      ("a", 2), ("a", 3)
//    ),2)


    // countByValue中Value不是KV键值对中的v的意思,而是整体的意思。
    // 数据类型可以使单value，双value，K-V
//    val res: collection.Map[(String, Int), Long] = rdd.countByValue()
//    println(res)   // Map((a,3) -> 1, (a,2) -> 1)
    // TODO countByValue可以实现 WordCount (8 / 10)

    val rdd = sc.makeRDD(List(
      ("a", 2), ("a", 3),("b",2),("b",10)
    ),2)

    // 思路
    // ("a", 2) => "a", "a"
    // ("a", 3) => "a", "a", "a"
    // ( a, 5 )
    val rdd1: RDD[String] = rdd.map(
      t => {
        val k: String = t._1
        val v: Int = t._2
        var str: String = (k + " ") * v
        str.trim
      }
    )
    val rdd2: RDD[String] = rdd1.flatMap(str => {
      str.split(" ")
    })
    val wordCount: collection.Map[String, Long] = rdd2.countByValue()
    println(wordCount)



    sc.stop()
  }
}
