package com.ynu.bigdata.scala.Unit6

object Scala09_Object_Instance_1 {
  def main(args: Array[String]): Unit = {

//    var u = new User("ybh")
//
//    println(u)

    val u = new User("ybh",23)

    println(u.name)


  }

  class User(var name:String){

    def this(name:String,age:Int){
      this(name)
    }

  }


}
