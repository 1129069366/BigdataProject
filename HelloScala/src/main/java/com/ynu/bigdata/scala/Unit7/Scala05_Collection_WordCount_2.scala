package com.ynu.bigdata.scala.Unit7

import scala.io.{BufferedSource, Source}

object Scala05_Collection_WordCount_2 {
  def main(args: Array[String]): Unit = {

    // TODO 1. 读取文件，获取原始数据
    //  line => Hello Scala
    val source: BufferedSource = Source.fromFile("data/word.txt")
    val lines: Array[String] = source.getLines().toArray
    source.close()

    // TODO 2. 将原始数据进行切分成一个一个的单词
    // "Hello Scala" => "Hello", "Scala"
    val words = lines.flatMap(
      line => {
        line.split(" ")
      }
    )

    // TODO 3. 对分词的结果进行分组操作（相同的单词放置在一起）
    // "Hello", "Hello" => { "Hello"=>List( Hello, Hello ) }
    val wordGroup: Map[String, Array[String]] = words.groupBy(word => word)

    val wordcount: Map[String, Int] = wordGroup.map(
      kv => {
        val key = kv._1
        val v = kv._2
        (key, v.size)
      }
    )
    println(wordcount)



  }
}
