package com.ynu.bigdata.scala.Unit8

object Scala01_Match {
  def main(args: Array[String]): Unit = {

    //     TODO - 模式匹配 - 匹配规则
    //     类似于java中switch
    //     当数据满足某一个分支时，执行完毕后，就直接跳出
    //     case _ 分支类似于default语言， 分支匹配其实就是顺序匹配,匹配到了一个，即使后面有再匹配的也不会往下走了。
    //     如果数据没有匹配任何规则，会发生错误
    //    类似java中的switch

//    val age = 30
//    age match {
//      case 10 => println("age is 10")
//      case 20 => println("age is 20")
//      case other => println(s"age is ${other}")
//    }

    //     顺序匹配  先匹配 _,匹配到_   后面的20也不走
    //
    //    val age = 20
    //    age match {
    //
    //      case _  => println("case is other")   //case is other
    //      case 10 => println("case is 10")
    //      case 20 => println("case is 20")
    //
    //    }

    var a: Int = 10
    var b: Int = 20
    var operator: Char = '+'
    var result = operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"
    }

    println(result)

  }
}
