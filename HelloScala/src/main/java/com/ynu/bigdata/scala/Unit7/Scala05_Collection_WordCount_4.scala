package com.ynu.bigdata.scala.Unit7

object Scala05_Collection_WordCount_4 {
  def main(args: Array[String]): Unit = {

    // TODO WordCount
    val list = List(
      ("Hello Scala", 4),
      ("Hello World", 2)
    )

    val list1: List[(String, Int)] = list.flatMap(
      kv => {
        val datas: Array[String] = kv._1.split(" ")
        val cnt: Int = kv._2
        datas.map(
          str => {
            (str, cnt)
        })
      }
    )


    val groupdata: Map[String, Int] = list1.groupBy(_._1).mapValues(
      values => {
        values.map(_._2).sum
      }
    )


    println(groupdata)




  }


}
