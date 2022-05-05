package com.ynu.bigdata.scala.Unit7

import scala.io.{BufferedSource, Source}

object Scala05_Collection_WordCount_1 {
  def main(args: Array[String]): Unit = {

      // TODO WordCount
      val list = List(
        ("Hello Scala", 4),
        ("Hello World", 2)
      )

      val list1 = List(
        "hello scala hello scala hello scala hello scala",
        "hello world hello world"
      )

      val list2 = list.map(
        t => {
          val line = t._1
          val cnt = t._2
          (line + " ") * cnt
        }
      )
      println(list2)

    }

}
