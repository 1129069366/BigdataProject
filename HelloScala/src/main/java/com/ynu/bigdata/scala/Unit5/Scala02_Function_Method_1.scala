package com.ynu.bigdata.scala.Unit5

/**
  * @program: HelloScala
  * @description
  * @author: Mr.Yang
  * @create: 2022-04-06 08:53
  **/
object Scala02_Function_Method_1 {

  def main(args: Array[String]): Unit = {
    def test():Unit = {

      println("test function ...")

    }


    val r = this.test()

    println(r)





  }



  def test():String = {
    println("test method")
    return "ybh"
  }

}
