package com.ynu.bigdata.scala.Unit7

object Scala05_Collection_WordCount_3 {
  def main(args: Array[String]): Unit = {

    // TODO WordCount   数据格式是List 里面放的是元祖,怎么进行单词统计
    val list = List(
      ("Hello Scala", 4),
      ("Hello World", 2)
    )

    // 转换成 List[String]
    val words: List[String] = list.map(
      kv => {
        (kv._1 + " ") * kv._2
      }
    )
    // 单词分组
    val wordsgroup: Map[String, List[String]] = words.flatten(str=>str.split(" ")).groupBy(str=>str)

//    val wordcount: Map[String, Int] = wordsgroup.map(
//      kv => (kv._1, kv._2.size)
//    )


    val wordCount = wordsgroup.map {
      case (word, list) => {
        (word, list.size)
      }
    }
    println(wordCount)

  }
}
