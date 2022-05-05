package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable

object Scala08_Collection_Map_1 {
  def main(args: Array[String]): Unit = {

    // TODO - 集合 - Map

    // java中从HashMap中获取一个不存在的key，会返回null
    //       HashMap允许放空键（Key）空值(Value)
    val map1 = mutable.Map(
      "a" -> 1, "b" -> 2, "a" -> 3,"d" -> 4,"e" -> 5
    )


    val maybeInt: Option[Int] = map1.get("f")

    if (maybeInt.isEmpty){
      println("没有对应的值"+maybeInt.get)
    }else{
      println(maybeInt.get)
    }






  }
}
