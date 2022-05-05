package com.ynu.bigdata.scala.Unit2


object ScalaString {
  def main(args: Array[String]): Unit = {
//    val name = "ybh";
////    println(println(name.substring(0, name.length - 2)))
//    printf("My name is %s\n" ,name)
//
//    printf(s"My name is ${name}")


//    val s =
//      """
//        | hello
//        | ybh
//        | lmj
//      """.stripMargin
//
//    println(s)

//    val s3 ="""This is
//              #my first time
//              #to learn Scala""".stripMargin('#').replaceAll("\r\n", " ")
//    println(s3)

    val name = "ybh"
    val password = "00000"

    val json =
      s"""
         |{"username":"${name}", "password":"${password}" }
         |{"username":"${name}"}
       """.stripMargin.replaceAll("\r\n",",")

    println(json)



  }
}
