package com.ynu.bigdata.scala.Unit5


object Scala04_Function_Normal_2 {
  def main(args: Array[String]): Unit = {






    // 匿名函数赋值给f
    val f = ()=>{
      println("hello ybh")
    }

//    println(f)


    //  如果函数的参数列表中没有声明任何的参数，那么参数列表括号可以省略
    def fun4 = println("fun4.....")

//    fun4

    // 一行代码省略大括号
    def fun3() = println("hello ybh")

//    fun3



    // 省略return语句
    def fun1():String = {
      "ybh"
    }

//    val res = fun1
//    println(res)

    // 自动推断返回值类型
    def fun2(age:Int) = {
      if (age<18){
        "成年人"
      }else{
        "未成年人"
      }
    }
//
//    val res = fun2(23)
//    println(res)



  }

}
