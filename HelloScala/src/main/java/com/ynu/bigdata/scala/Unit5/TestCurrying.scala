package com.ynu.bigdata.scala.Unit5

object TestCurrying {
  def main(args: Array[String]): Unit = {

    println(add(1, 2))

    println(add1(1)(2))

  }

  def add(a:Int,b:Int):Int = {
    return a + b
  }

  def add1(a:Int)(b:Int): Int ={
    a + b
  }




}
