package com.ynu.bigdata.scala.Unit6

import scala.beans.BeanProperty

object Scala05_Object_Field {
  def main(args: Array[String]): Unit = {
    var u1 = new User()
    u1.setAddress("福建")
    println(u1)
  }
}

class User{
  private var username:String = _
  private var email : String = _
  @BeanProperty var address : String = _
}
