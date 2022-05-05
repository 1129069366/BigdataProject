package com.ynu.bigdata.scala.Unit10

object Scala01_Transform {
  def main(args: Array[String]): Unit = {



    implicit def transform( d:Double): Int ={
      d.toInt
    }


    val age:Int = thirdPart();
    println(age)


  }


  def thirdPart():Double = {
    30.0
  }


}
