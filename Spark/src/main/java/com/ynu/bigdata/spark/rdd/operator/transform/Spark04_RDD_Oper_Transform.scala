package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}


object Spark04_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 算子 - 转换 - 扁平化
    val rdd = sc.makeRDD(
      List("Hello world", "Hello Spark")
    )

    val rdd1 = sc.makeRDD(
      List(
        List(1, 2, 3), List(4, 5, 6)
      )
    )


    // 扁平化字符串集合
    val stringRDD = rdd.flatMap(
      str => {
        str.split(" ")
      }
    )
    stringRDD.collect().foreach(println(_))


    //扁平化二维集合
    val listRDD = rdd1.flatMap(
      list => {
        list
      }
    )
    listRDD.collect().foreach(println(_))






    sc.stop()


  }
}
