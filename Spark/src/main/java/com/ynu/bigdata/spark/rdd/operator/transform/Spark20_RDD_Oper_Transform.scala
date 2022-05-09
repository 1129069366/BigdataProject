package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

object Spark20_RDD_Oper_Transform {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    val rdd1 = sc.makeRDD(
      List(
        ("a", 1),  ("b", 2), ("c", 3)
      )
    )
    val rdd2 = sc.makeRDD(
      List(
        ("a", 4),  ("a", 5), ("a", 6)
      )
    )
    // 数据库设计的三范式
    // user => id,  name, deptid, deptname
    //         1    zs  , 1,      yyyyy
    //         1    zs  , 1,      yyyyy
    // dept => id,  name
    //         1,   yyyyy

    // Join => SQL => 主外键

    // spark中join操作主要针对于两个数据集中相同的key的数据连接
    // join操作可能会产生笛卡尔乘积，可能会出现shuffle，性能比较差
    // 所以如果能使用其他方式实现同样的功能，不推荐使用join
    //val rdd3: RDD[(String, (Int, Int))] = rdd1.join(rdd2)
//    val rdd3: RDD[(String, (Int, Int))] = rdd1.join(rdd2)

    // 左外连接
    // val rdd3: RDD[(String, (Int, Option[Int]))] = rdd1.leftOuterJoin(rdd2)
    // 右外连接
    // val rdd4 = rdd1.rightOuterJoin(rdd2)
    // 全连接
    // val rdd5 = rdd1.fullOuterJoin(rdd2)

//    rdd3.collect().foreach(println(_))






  }
}
