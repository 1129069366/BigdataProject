package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}


object Spark04_RDD_Oper_Transform_1 {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 算子 - 转换 - 扁平化
    // 将List(List(1,2),3,List(4,5))进行扁平化操作

    val rdd = sc.makeRDD(
      List(List(1, 2), 3, List(4, 5))
    )
    val rdd1 = rdd.flatMap {
      case value: List[_] => value
      case other => List(other)
    }
    rdd1.collect().foreach(println(_))
    // 输出
//    1
//    2
//    3
//    4
//    5





    sc.stop()

  }
}
