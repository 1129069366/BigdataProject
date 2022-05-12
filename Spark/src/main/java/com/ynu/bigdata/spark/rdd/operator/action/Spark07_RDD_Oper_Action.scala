package com.ynu.bigdata.spark.rdd.operator.action

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object Spark07_RDD_Oper_Action {
  def main(args: Array[String]): Unit = {
    // 一个应用程序, Driver程序
    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)



    val rdd: RDD[Int] = sc.makeRDD(
      List(1, 2, 3, 4),2
    )

    val user = new User()  // Driver
    rdd.foreach(
      num=>{
        println(num + user.age)  // Executor  算子里面的代码是在Executor中执行的。
      }
    )

    // Scala语法 ： 闭包
    // Spark在执行算子时，如果算子的内部使用了外部的变量（对象），那么意味着一定会出现闭包
    // 在这种场景中，需要将Driver端的变量通过网络传递给Executor端执行，这个操作不用执行也能判断出来
    // 可以在真正执行之前，对数据进行序列化校验，

    // 如果rdd中集合没有数据也需要序列化吗?  需要。 因为在执行前就会进行闭包检测。
//    val rdd: RDD[Int] = sc.makeRDD(
//      List[Int](),2
//    )

    // Spark在执行作业前，需要先进行闭包检测功能。



    sc.stop()
  }


  class User extends Serializable {
    val age = 30
  }

}
