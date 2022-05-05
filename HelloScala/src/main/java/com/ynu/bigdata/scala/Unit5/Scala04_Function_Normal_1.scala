package com.ynu.bigdata.scala.Unit5


object Scala04_Function_Normal_1 {
  def main(args: Array[String]): Unit = {

    def fun1(names:String*):Unit = {

      for (name:String <- names){
        println(s"name is ${name}")
      }
    }

//    fun1("ybh","lmj","haha")

    def fun2(age:Int,names:String*):Unit = {

      println(s"age is ${age}")

      for (name <- names){
        println(s"name is ${name}")
      }




   }


    fun2(23,"ybh","lmj")


  }

}


