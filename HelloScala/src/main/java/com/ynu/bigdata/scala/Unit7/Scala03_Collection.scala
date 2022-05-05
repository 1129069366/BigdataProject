package com.ynu.bigdata.scala.Unit7

object Scala03_Collection {
  def main(args: Array[String]): Unit = {
    // TODO - 不可变List集合 - 方法


    val array = List(1,2,3,4,5,4,88,9,1)

    println(array.size)  // 集合的大小
    println(array.length) //集合的长度
    println(array.isEmpty)  //集合是否为空
    println(array.contains(4)) //集合是否包含元素4
    println(array.distinct.mkString(",")) // 集合去重用","分割转为字符串
    println(array.reverse.mkString(","))  // 集合反转

    println(array.mkString(","))
    array.foreach(println(_))

    array.iterator





  }
}
