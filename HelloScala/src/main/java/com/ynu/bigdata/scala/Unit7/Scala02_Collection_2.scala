package com.ynu.bigdata.scala.Unit7

import java.util

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_2 {
  def main(args: Array[String]): Unit = {

    // TODO - 集合 - 数组 - 可变数组
    val array = Array(1,2,3,4)

    // 不可变 => 可变
    var buffer:mutable.Buffer[Int] = array.toBuffer
    var buffer1 = buffer += 5
    println(buffer eq buffer1)  // true

    // 可变 => 不可变
    val array1:Array[Int] = buffer.toArray
    val array2 = array1 :+ 5
    println(array1 eq array2)   // false

    array1.foreach(i=>println(i))  //遍历



  }
}
