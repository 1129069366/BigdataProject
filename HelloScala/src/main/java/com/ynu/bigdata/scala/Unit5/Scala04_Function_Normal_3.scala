package com.ynu.bigdata.scala.Unit5

/**
  * @program: HelloScala
  * @description
  * @author: Mr.Yang
  * @create: 2022-04-06 09:53
  **/
object Scala04_Function_Normal_3 {
  def main(args: Array[String]): Unit = {

    def fun1()={
      println("ybh")
    }

//    val a = fun1   不加_ 就是直接执行了fun1方法  而a是fun1的返回值所以不能用a()
    val b = fun1 _  // 加_之后   b就是函数类型变量，可以执行b()

//    a()
    b()



  }
}
