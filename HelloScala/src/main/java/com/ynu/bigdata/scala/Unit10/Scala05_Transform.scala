package com.ynu.bigdata.scala.Unit10

import com.ynu.bigdata.scala.Unit10.Scala05_Transform.User

object Scala05_Transform extends MyTrait {
  def main(args: Array[String]): Unit = {

    // TODO 隐式转换的范围(也就是隐式转换的代码写在哪里):
    // TODO 1. 当前代码作用域
    // TODO 2. 父类或父类的伴生对象
    // TODO 3. 特质或特质的伴生对象
    // TODO 4. 在其他地方声明（包对象中）
    // TODO 5. 直接导入
    //import com.atguigu.bigdata.scala.test.TestTransform._
    val user = new User() with MyTrait
    user.insertUser()
    user.updateUser()

  }
//  implicit class UserExt(user:User) {
//    def updateUser(): Unit = {
//      println("update user...")
//    }
//  }
  class User {
    def insertUser(): Unit = {
      println("insert user...")
    }
    //        def updateUser(): Unit = {
    //            println("update user...")
    //        }
  }
}
class Parent {
      implicit class UserExt(user:User) {
          def updateUser(): Unit = {
              println("update user...")
          }
      }
}
object Parent {
//      implicit class UserExt(user:User) {
//          def updateUser(): Unit = {
//              println("update user...")
//          }
//      }
}
trait MyTrait {
      implicit class UserExt(user:User) {
          def updateUser(): Unit = {
              println("update user...")
          }
      }
}
object MyTrait {
//      implicit class UserExt(user:User) {
//          def updateUser(): Unit = {
//              println("update user...")
//          }
//      }
}