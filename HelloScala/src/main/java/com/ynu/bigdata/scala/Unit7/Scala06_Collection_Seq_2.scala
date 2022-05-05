package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable.ListBuffer

object Scala06_Collection_Seq_2 {
  def main(args: Array[String]): Unit = {

    // TODO - 集合 - Seq - 可变
    val list = ListBuffer(1,2,3,4)

    //list.append()
    //list.appendAll()
    //list.insert()

    //list.update(0, 5) // 改变自身
    //println(list)
    //list.updated(0, 6) // 创建新的list  产生新集合  原来的集合不变
    println(list)

    //list.remove(1)
    //list.remove(1,2)    // 从1索引开始 删除两个
    //
    //list.mkString()
    // 迭代器遍历
    val iterator: Iterator[Int] = list.iterator
    while (iterator.hasNext){
      println(iterator.next())
    }
    //list.foreach()

  }
}
