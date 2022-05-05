package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable.ArrayBuffer

object Scala04_Collection_4 {
  def main(args: Array[String]): Unit = {

    // TODO - 集合 - 方法
//    val array = ArrayBuffer(1,4,2,3)
//    // 只需要告诉它用什么方式来排序   比如当成数字还是当成字符串。升序还是降序
//    println(array.sortBy(num => num))  // ArrayBuffer(1, 2, 3, 4) 当成数字 默认是升序排列

    val array = ArrayBuffer("1","11","2","4","77")
    // 就是暗转字符串排序
    println(array.sortBy(num => num))  //  ArrayBuffer(1, 11, 2, 4, 77)
    // 转成数字排序
    println(array.sortBy(num=>num.toInt))  //
    //转成数字排序降序
    array.sortBy(num=>num.toInt)(Ordering.Int.reverse)     // 函数柯里化  你还记得吗?



  }
}
