package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable

object Scala13_Collection_Method_4 {
  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4)

    println(list.foldLeft("")(_ + _))

    // 合并两个集合的数字
    val map1 = mutable.Map(
      ("a", 1), ("b", 2), ("c", 3)
    )
    val map2 = mutable.Map(
      ("a", 4), ("d", 5), ("c", 6)
    )


    val map3: mutable.Map[String, Int] = map2.foldLeft(map1)( // map1是集合   map2中的元素被拆分成了一个个的kv
      (map, kv) => {
        val key = kv._1
        val cnt = kv._2
        val oldcnt = map.getOrElse(key, 0)
        map.update(key, oldcnt + cnt)
        map // 更新之后返回
      }
    )
    println(map3)





  }
}
