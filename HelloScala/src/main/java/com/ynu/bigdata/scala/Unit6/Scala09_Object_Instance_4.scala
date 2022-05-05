package com.ynu.bigdata.scala.Unit6

object Scala09_Object_Instance_4 {
  def main(args: Array[String]): Unit = {
    val person: ScalaUser = ScalaUser.getInstance()


    println(person.name)
    println(person.age)


  }
}
