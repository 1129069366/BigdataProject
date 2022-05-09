package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark07_RDD_Oper_Transform_1 {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    val lines: RDD[String] = sc.textFile("data/apache.log")


    val rdd1: RDD[String] = lines.filter(
      line => {
        val time: String = line.split(" ")(3)
        val date: String = time.split(":")(0)
//        println(date)
        date.equals("17/05/2015")
      }
    )

    val rdd2: RDD[String] = rdd1.map(line => {
      line.split(" ")(6)
    })
    rdd2


    rdd2.collect().foreach(println(_))



    sc.stop()

  }
}
