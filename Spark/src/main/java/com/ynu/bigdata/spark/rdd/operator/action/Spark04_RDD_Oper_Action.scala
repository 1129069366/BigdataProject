package com.ynu.bigdata.spark.rdd.operator.action

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

import scala.collection.mutable.ListBuffer


object Spark04_RDD_Oper_Action {
  def main(args: Array[String]): Unit = {

    // 一个应用程序, Driver程序
    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 算子 - 行动
    val rdd = sc.makeRDD(List(1,4,3,2),2)
    // rdd.countByKey() 报错
    // countByKey很明显是处理双值数据的。
    val rdd1: RDD[(String, Int)] = rdd.map(
      ("a", _)
    )

    // countByKey算子表示相同key出现的次数
    val countByKey: collection.Map[String, Long] = rdd1.countByKey()
//    println(countByKey)  // Map(a -> 4)
//    rdd1.collect().foreach(println(_))
//    (a,1)
//    (a,4)
//    (a,3)
//    (a,2)

    // TODO countByKey算子可以实现 WordCount (7 / 10)
    // 思路  准换数据
    // (a, 1), (a, 4), (a, 3), (a, 2)
    // (a, 4) => (a, 1),(a, 1),(a, 1),(a, 1)
    // (a, 3) => (a, 1),(a, 1),(a, 1)

    // 数据转换
    val rdd2: RDD[List[(String, Int)]] = rdd1.map(
      tuple => {
        val key: String = tuple._1
        val cnt: Int = tuple._2
        val list: ListBuffer[(String, Int)] = ListBuffer()
        for (i <- 1 to cnt) {
          list.append((key, 1))
        }
        list.toList
      }
    )
    rdd2.collect().foreach(println(_))
    //    List((a,1))
    //    List((a,1), (a,1), (a,1), (a,1))
    //    List((a,1), (a,1), (a,1))
    //    List((a,1), (a,1))

    // 扁平化
    val rdd3: RDD[(String, Int)] = rdd2.flatMap(list=>list)
    rdd3.collect().foreach(println(_))
//    (a,1)
//    (a,1)
//    (a,1)
//    (a,1)
//    (a,1)
//    (a,1)
//    (a,1)
//    (a,1)
//    (a,1)
//    (a,1)


    val wordCount: collection.Map[String, Long] = rdd3.countByKey()
    println(wordCount)   //Map(a -> 10)
    sc.stop()

  }
}
