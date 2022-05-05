package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_1 {
  def main(args: Array[String]): Unit = {

    var buffer1 = ArrayBuffer(1,2,3,4)
    var buffer2 = ArrayBuffer(5,6,7,8)

    var buffer3 = buffer1+=5
    println(buffer1 eq buffer3)    // true 可变数组，所以是true

    // 使用 ++ 运算符会产生新的集合数组
    val buffer4: ArrayBuffer[Int] = buffer1 ++ buffer2

    // 使用 ++= 运算符会更新之前的集合，不会产生新的数组

    val buffer5: ArrayBuffer[Int] = buffer1 ++= buffer2
    println( buffer1 eq buffer4 ) // false
    println( buffer1 eq buffer5 ) // true


  }
}
