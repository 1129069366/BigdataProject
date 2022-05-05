package com.ynu.bigdata.scala.Unit10

object Scala03_Transform {
  def main(args: Array[String]): Unit = {

    // OCP

   def reg(implicit password:String = "000000"): Unit ={
     println(password)
   }

   implicit val password = "2356"

   reg()            // 000000
   reg("123456")   // 123456
   reg



  }

}
