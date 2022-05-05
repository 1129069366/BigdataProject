package com.ynu.bigdata.scala.Unit12

object Scala02_Regex {
  def main(args: Array[String]): Unit = {

    val regex = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))\\d{8}$".r

    val data = "18243397305"

    val maybeString: Option[String] = regex.findFirstIn(data)
    if (maybeString.isEmpty){
      println("不符合规则")
    }else{
      println("符合规则："+maybeString.get)
    }


  }
}
