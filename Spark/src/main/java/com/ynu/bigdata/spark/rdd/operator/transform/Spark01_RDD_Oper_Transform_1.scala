package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

object Spark01_RDD_Oper_Transform_1 {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")  // 这里写local就固定是单线程执行了，不管分区是几个都是1 2 3 4
    val sc = new SparkContext(conf)

    // TODO 算子 - 转换 - map
    val rdd = sc.makeRDD(
      List(1,2,3,4),2
    )

    // map算子表示将数据源中的每一条数据进行处理
    // map算子的参数是函数类型： Int => U(不确定)

    //    def function(num:Int): Int ={
    //      num*2
    //    }
    //
    //    // A=>B
    //    val rInt: RDD[Int] = rdd.map(function)
//    val rInt: RDD[Int] = rdd.map(_*2)
//    rInt.collect().foreach(println)


    // 测试执行顺序   分区内有序,分区间无序    1一定在2前面   3一定在4前面
//    val rInt: RDD[Int] = rdd.map(num=>{
//      println(num)
//      num*2
//    })
//    rInt.saveAsTextFile("output")


    // 同一个分区内  一条数据走完全部的逻辑才会走下一条数据
    val rdd1: RDD[Int] = rdd.map(num => {
      println("*******" +  num)
      num
    })


    val rdd2: RDD[Int] = rdd1.map(num => {
      println("#######" + num)
      num
    })


    rdd2.saveAsTextFile("output")

  }
}
