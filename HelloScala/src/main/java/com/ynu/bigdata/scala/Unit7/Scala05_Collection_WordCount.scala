package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable
import scala.io.{BufferedSource, Source}

object Scala05_Collection_WordCount {
  def main(args: Array[String]): Unit = {

    // TODO 1. 读取文件，获取原始数据
    //  line => Hello Scala
    val source: BufferedSource = Source.fromFile("data/word.txt")
    val lines: Array[String] = source.getLines().toArray
    source.close()
    val buffer: mutable.Buffer[String] = lines.toBuffer

    val strings: mutable.Buffer[String] = buffer.flatMap(_.split(" "))

    val group: Map[String, mutable.Buffer[String]] = strings.groupBy(str=>str)

//    println(group)

    val mapgroup: Map[String, Int] = group.mapValues(v => {
      v.size
    })
    println(mapgroup)


  }
}
