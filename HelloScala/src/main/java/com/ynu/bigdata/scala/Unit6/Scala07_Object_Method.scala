package com.ynu.bigdata.scala.Unit6

object Scala07_Object_Method {
  def main(args: Array[String]): Unit = {

    val test7 = new Test7()
    println(test7.login("ybh", "ybhlmj.520"))


  }




  class Test7{
    var id :Int = 1

    def login(username:String,password :String): Boolean ={

      println(s"username:$username")
      println(s"password:$password")

      false
    }



  }
}
