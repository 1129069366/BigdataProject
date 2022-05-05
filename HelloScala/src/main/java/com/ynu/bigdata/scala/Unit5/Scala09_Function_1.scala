package com.ynu.bigdata.scala.Unit5

object Scala09_Function_1 {
  def main(args: Array[String]): Unit = {


    def test1(): Unit = {
      println("test")
      test1()
    }

    test1()


  }
}
