package com.ynu.bigdata.scala.Unit10

object Scala04_Transform {
  def main(args: Array[String]): Unit = {
    // 声明类
    // 声明方法
    // user => userExt
    //        implicit def transform( user : User ): UserExt = {
    //            new UserExt(user)
    //        }
    // scala中可以将implicit关键字声明在类的前面。称之为隐式类,不能为顶级对象。简单说不能放在最外面,即Scala04_Transform前面。

    val user = new User()
    user.insertUser()
    user.updateUser()

  }

  // scala中可以将implicit关键字声明在类的前面。称之为隐式类,不能为顶级对象
  implicit class UserExt(user:User) {
    def updateUser(): Unit = {
      println("update user...")
    }
  }
  class User {
    def insertUser(): Unit = {
      println("insert user...")
    }
    //        def updateUser(): Unit = {
    //            println("update user...")
    //        }

  }
}
