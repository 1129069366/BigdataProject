package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark08_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)


    val rdd: RDD[Int] = sc.makeRDD(1 to 10)
    // 抽取数据，采样数据
    // 第一个参数表示抽取数据的方式：true. 抽取放回，false. 抽取不放回
    // 第二个参数和第一个参数有关系
    //     如果抽取不放回的场合：参数表示每条数据被抽取的几率
    // val rdd1: RDD[Int] = rdd.sample(false,0.5)
//    val rdd1: RDD[Int] = rdd.sample(true,2)
    //     如果抽取放回的场合：参数表示每条数据希望被重复抽取的次数
    // 第三个参数是【随机数】种子
    //     随机数不随机，所谓的随机数，其实是通过随机算法获取的一个数。设定一个相同的随机数种子，多次执行结果是一样的，便于验证用的。
    val rdd1: RDD[Int] = rdd.sample(false,0.5,2)
    rdd1.collect().foreach(println)


    sc.stop()
  }
}
