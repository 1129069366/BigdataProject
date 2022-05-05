package com.ynu.bigdata.scala.Unit5

/**
  * @program: HelloScala
  * @description
  * @author: Mr.Yang
  * @create: 2022-04-06 08:48
  **/
object Scala01_Function {
  def main(args: Array[String]): Unit = {


    def test1():Unit = {
      println("test 01 ...")
    }


    val r = test1
    println(r)

//    var r = test1()
//    println(r)
//    print(test2())
  }


  def test2():String = {
    println("test02 .....")
    return "ybh"
  }


}
