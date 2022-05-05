package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection_1 {
  def main(args: Array[String]): Unit = {

    // 从集合中获取部分数据
    val array = ArrayBuffer(1,2,3,4,5,6,7)
    println(array.head)   // 1
    println(array.tail)   // 除了第一个剩下的    2 3 4 5 6 7
    println(array.last)   // 最后一个 7
    println(array.init)   // 除了最后一个前面的所有
    println(array.inits)

    // 取前三个
    println(array.take(3))

    // 取后三个
    println(array.reverse.take(3).reverse)
    println(array.takeRight(3))
    // 删除第一个取后面的
    println(array.drop(1))
    // 删除最后一个取前面的
    println(array.dropRight(1))



  }
}
