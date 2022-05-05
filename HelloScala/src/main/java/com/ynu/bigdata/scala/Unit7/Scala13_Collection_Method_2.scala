package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable.ListBuffer

object Scala13_Collection_Method_2 {
  def main(args: Array[String]): Unit = {

    val list1 = List(1,2,3,4,5,6,7,8)
    val res:ListBuffer[Int] = ListBuffer()

    // 滑动窗口  默认滑动步长为1  可以设置  sliding的第二个窗口
    // 滚动窗口  滑动步长和滑动窗口大小一样 不会有重合部分
    val iterator: Iterator[List[Int]] = list1.sliding(3)
    while (iterator.hasNext){
      val it: List[Int] = iterator.next()
      println(it)
//      List(1, 2, 3)
//      List(2, 3, 4)
//      List(3, 4, 5)
//      List(4, 5, 6)
//      List(5, 6, 7)
//      List(6, 7, 8)

    }


  }
}
