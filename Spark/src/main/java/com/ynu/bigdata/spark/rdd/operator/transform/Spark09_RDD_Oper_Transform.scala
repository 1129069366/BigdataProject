package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark09_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    val rdd1: RDD[Int] = sc.makeRDD(
      List(1, 1, 1, 1)
    )

    // map(x => (x, null)).reduceByKey((x, _) => x, numPartitions).map(_._1)
    // 【1，1，1】
    // 【(1, null)，(1, null)，(1, null)】
    // 【null, null, null】
    // 【null, null】
    // 【(1, null)】  reduceByKey
    // 【1】   .map(_._1)


    val rdd2: RDD[Int] = rdd1.distinct()   // 底层是有shuffle的.因为这些数据(这里是1)有可能是在不同的分区中，所以不同分区需要进行落盘操作。
    rdd2.collect().foreach(println(_))



    sc.stop()
  }


}
