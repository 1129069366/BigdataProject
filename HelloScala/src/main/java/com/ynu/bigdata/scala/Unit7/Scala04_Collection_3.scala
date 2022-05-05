package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable.ArrayBuffer

object Scala04_Collection_3 {
  def main(args: Array[String]): Unit = {

//    // TODO - 集合 - 方法
//    val array = ArrayBuffer(1,2,3,4)

//    val stringToInts: Map[String, ArrayBuffer[Int]] = array.groupBy(num => {
//      if (num % 2 == 0) {
//        "偶数"
//      } else {
//        "奇数"
//      }
//    })
    //println(stringToInts)   //Map(奇数 -> ArrayBuffer(1, 3), 偶数 -> ArrayBuffer(2, 4))

    // 分组的键用true和false来表示
//    val booleanToInts: Map[Boolean, ArrayBuffer[Int]] = array.groupBy(num => {
//      num % 2 == 0
//    })
//    println(booleanToInts)   Map(false -> ArrayBuffer(1, 3), true -> ArrayBuffer(2, 4))

    //进一步简化   并且用结果0 1分组
//    val intToInts: Map[Int, ArrayBuffer[Int]] = array.groupBy(_%2)
//    println(intToInts)     // Map(1 -> ArrayBuffer(1, 3), 0 -> ArrayBuffer(2, 4))


  // 练习  以H开头的放一个组
    val array = ArrayBuffer(
      "Hello", "Scala", "Hadoop", "Spark"
    )

    val booleanToStrings: Map[Boolean, ArrayBuffer[String]] = array.groupBy(_.startsWith("H"))
    println(booleanToStrings)   // Map(false -> ArrayBuffer(Scala, Spark), true -> ArrayBuffer(Hello, Hadoop))

    // 首个字母相同的放在一起
    println(array.groupBy(_.substring(0, 1)))


  }
}
