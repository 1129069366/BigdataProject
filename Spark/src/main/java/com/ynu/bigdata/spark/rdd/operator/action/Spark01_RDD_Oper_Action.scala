package com.ynu.bigdata.spark.rdd.operator.action

import org.apache.spark.{SparkConf, SparkContext}


object Spark01_RDD_Oper_Action {
  def main(args: Array[String]): Unit = {

    // 一个应用程序, Driver程序
    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 行动算子
    val rdd = sc.makeRDD(List(1,2,3,4))

    rdd.collect()
//    def collect(): Array[T] = withScope {
//      val results = sc.runJob(this, (iter: Iterator[T]) => iter.toArray)
//      Array.concat(results: _*)
//    }


    sc.stop()
  }
}
