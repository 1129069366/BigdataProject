package com.ynu.bigdata.scala.Unit6

object Scala12_Object_Trait_1 {
  def main(args: Array[String]): Unit = {

    var c1 = new User()
    c1.updateUser()
    c1.deleteUser()



//    var c1 = new Child()
//    c1.updateUser()
  }


  class User extends updateUser with deleteUser{

    var name:String = _

  }


  trait updateUser{
    def updateUser(): Unit = {
      println("update user...")
    }
  }


  trait deleteUser{
    def deleteUser():Unit = {
      println("delete user...")
    }
  }





//  class Parent{
//    def updateUser():Unit={
//      println("update user...")
//    }
//  }
//
//  class Child extends Parent{
//
//  }



}
