package com.ynu.bigdata.scala.Unit6

object Scala09_Object_Instance {
  def main(args: Array[String]): Unit = {

    var u:User = new User()
    u.test()

  }

  class User(){
    // 类的初始化
    // 构造方法体 & 类的主体内容
    val name : String = "zhangsan"
    def test(): Unit ={
      println("......")
    }

  }

}
