package com.ynu.bigdata.scala.Unit10

object Scala02_Transform {
  def main(args: Array[String]): Unit = {

    //    下面代码不报错原因  在 println方法所在的类Predef中提供了大量的隐式转换的方法。
    // val b :Byte = 10
    // val i :Int = b

    implicit def transform(user: User): UserExt ={
      new UserExt()
    }

    // 使用implicit声明的函数为隐式函数。
    var u1 = User("ybh",23)
    u1.update()
    u1.delete()
    println(u1.name)


  }

  class User{
    var name:String = _

    var age:Int = _


    def update(): Unit ={
      println("update User.....")
    }

  }

  object User{

    def apply(name:String,age:Int): User ={
      val user = new User()
      user.name = name
      user.age = age
      user
    }
  }

  class UserExt{
    def delete(): Unit ={
      println("delete User.....")
    }
  }



}
