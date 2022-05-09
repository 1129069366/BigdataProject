package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object Spark17_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    // TODO 将数据List(("a", 88), ("b", 95), ("a", 91), ("b", 93), ("a", 95), ("b", 98))求每个key的平均值
    val rdd = sc.makeRDD(
      List(
        ("a", 1), ("a", 2), ("b", 3),
        ("b", 4), ("b", 5), ("a", 6)
      ),
      2
    )

    // groupByKey() => total / cnt = avg
    // reduceByKey() => total / cnt = avg
    // aggregateByKey(z)(f1, f2) => total / cnt = avg
    // foldByKey(z)(f1) => total / cnt = avg
    // (a, 3)(b, 4)
    // 以上这些函数都无法知道cnt

    // 计算"a"的平均值需要知道以"a"为键的元祖的个数,如果数据是如下的格式,每次计数都加1.就可以知道cnt。
    // 如果数据是下面这种格式，可以用combineByKey来处理
    val rdd1 = sc.makeRDD(
      List(
        ("a", (1,1)), ("a", 2), ("b", (3,1)),
        ("b", (4,1)), ("b", 5), ("a", (6,1))
      ),
      2
    )

    val wordCount: RDD[(String, (Int, Int))] = rdd.combineByKey(
      num => (num, 1),
      (x: (Int, Int), y) => {
        (x._1 + y, x._2 + 1)
      },
      (x: (Int, Int), y: (Int, Int)) => {
        (x._1 + y._1, x._2 + y._2)
      }
    )
//     wordCount.collect().foreach(println(_))
//    (b,(12,3))
//    (a,(9,3))

    // 计算平均值
    val avg: RDD[(String, Int)] = wordCount.mapValues(
      list => {
        list._1 / list._2
      }
    )
    avg.collect().foreach(println)



    sc.stop()


  }
}
