package com.ynu.bigdata.scala.Unit7

object Scala13_Collection_Method_3 {
  def main(args: Array[String]): Unit = {

    val list1 = List(1,2,3,4)
    val list2 = List(5,6,7,8,9, 10)

    // 所谓的拉链，其实就是将两个集合相同的位置的数据连接在一起
    val tuples: List[(Int, Int)] = list1.zip(list2)
//    println(tuples)  // List((1,5), (2,6), (3,7), (4,8))


    // 一个集合自己拉链    数据和索引拉链在一起
    println(list2.zipWithIndex)




  }

}
