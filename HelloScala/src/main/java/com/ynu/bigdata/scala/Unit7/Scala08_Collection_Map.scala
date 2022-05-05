package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable

object Scala08_Collection_Map {
  def main(args: Array[String]): Unit = {

    // TODO - 集合 - Map
    // map存储的数据也是K-V键值对
    // map描述了一个数据无序，K不能重复的集合
    // Scala中k-v键值对非常特殊

    // JDK1.8 之前  Entry
    // JDK1.8 之后  Node => TreeNode

    // 不可变Map
    val map = Map(
      "a" -> 1, "b" -> 2, "a" -> 3,"d" -> 4,"e" -> 5
    )
    // 可变Map
    val map1 = mutable.Map(
      "a" -> 1, "b" -> 2, "a" -> 3,"d" -> 4,"e" -> 5
    )
    map1.put("f", 6)
    map1.update("a", 7)
    map1.remove("e")


    //println(map)
    println(map1)





  }
}
