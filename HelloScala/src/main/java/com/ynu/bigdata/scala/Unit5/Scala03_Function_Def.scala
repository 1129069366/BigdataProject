package com.ynu.bigdata.scala.Unit5


object Scala03_Function_Def {
  def main(args: Array[String]): Unit = {

    def fun1():Unit = {
      println("fun1...")
    }
//
//    fun1()
//    fun1

    def fun2():String = {

//      println("fun2.....")
      return "fun2"
    }

//     val r2 = fun2
//    println(r2)


    def fun6(name:String,age:Int):String  = {
      println(s"name is : ${name},age is ${age}")

      return "ybh"
    }

    val name = fun6("ybh",23)
    println(name)





  }
}
