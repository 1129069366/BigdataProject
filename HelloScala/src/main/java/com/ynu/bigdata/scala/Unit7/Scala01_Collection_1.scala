package com.ynu.bigdata.scala.Unit7

object Scala01_Collection_1 {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 数组
    // 集合分为两大类：可变集合，不可变集合
    // Scala默认提供的集合都是不可变。
    val array = new Array[String](3)  // 定义一个String类型数组  长度为3
    array(0) = "a"   //初始化
    array(1) = "b"
    array(2) = "c"
//    array(3) = "d"

    // 使用集合的伴生对象构建集合，并同时初始化
    val array1 = Array(1,2,3,4)
    array1.foreach(num=>print(num))
    println()
    val ints1 = array1 :+ 5
    val ints =  5 +: array
//    ints1.foreach(num=>print(num))
//    println()
//    println(array1 eq ints1)

    println(ints1.mkString(","))
    println(ints.mkString(","))











  }
}
