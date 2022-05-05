package com.ynu.bigdata.scala.Unit2

import scala.io.{BufferedSource, Source}


object ScalaIn {
  def main(args: Array[String]): Unit = {

//    val s1 = scala.io.StdIn.readLine()
//    println(s1)

    val source:BufferedSource = Source.fromFile("D:\\develop\\BigdataProject\\HelloScala\\src\\main\\java\\com\\ynu\\bigdata\\scala\\Unit2\\data\\word.txt")

    val strings = source.getLines()


    while (strings.hasNext){
      println(strings.next())
    }

    source.close()


  }
}
