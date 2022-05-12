package com.ynu.bigdata.spark.rdd.operator.action

import org.apache.spark.{SparkConf, SparkContext}


object Spark02_RDD_Oper_Action {
  def main(args: Array[String]): Unit = {


    // 一个应用程序, Driver程序
    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 算子 - 行动算子  
    // 算子和scala中的方法大不一样，算子是分布式计算用的，有分区的概念。
    val rdd = sc.makeRDD(List(1,2,3,4),2)
    val i: Int = rdd.reduce(_+_)
    println(i)    //10
    
    
    // 采集数据
    // 将数据从Executor端采集回到Driver端
    // collect会将数据全部拉取到Driver端的内存中，形成数据集合，可能会导致内存溢出
    val ints: Array[Int] = rdd.collect()
    println(ints.mkString(","))   // 1,2,3,4


    // 统计数据的个数
    val l: Long = rdd.count()
    println(l)

    // rdd第一个元素
    val i1: Int = rdd.first()
    println(i1)
    
    // 返回一个由RDD的前3个元素组成的数组
    val ints2: Array[Int] = rdd.take(3);
    println(ints2.mkString(","))


    // 返回一个由RDD排好序后的前3个元素组成的数组
    val ints3: Array[Int] = rdd.takeOrdered(3)
    println(ints3.mkString(","))


    sc.stop()

  }

}
