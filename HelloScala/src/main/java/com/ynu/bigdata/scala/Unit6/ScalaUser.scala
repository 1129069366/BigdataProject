package com.ynu.bigdata.scala.Unit6



class ScalaUser private(){
  var name:String = _

  var age:Int = _

  def this(name:String,age:Int){
    this()
    this.name = name
    this.age = age
  }

}


object ScalaUser {

  def getInstance(): ScalaUser ={
    return new ScalaUser("ybh",23)
  }

}
