package com.ynu.bigdata.scala.Unit8

object Scala02_Match {
  def main(args: Array[String]): Unit = {

    // TODO - 模式匹配 - 匹配规则
    // 匹配常量

//    def describe(x:Any):String = x match {
//
//      case '+'=>"x is Character"
//      case 1 =>"x is 1"
//      case false => "x is false"
//      case _=>"x is other"
//    }
//
//    val result = describe("haha")
//    println(result)


    // 匹配类型

    // TODO 匹配类型
    // 类型前增加变量名称,这个变量就是将数据转换成指定类型的变量
    // 如果想要使用下划线代表的数据，可以给下划线起名来使用
    // scala中类型匹配时，是不考虑泛型的,但是Array类型是特殊的。

    def describe(x:Any):Any = x match {
      case i:Int =>i+1
      case s:String=> "hello string"
      case f:Boolean => s"x is ${f}"
      case l:List[Int] => "List"
      case a:Array[Int] => "Array"
      case other => "something else"
    }

    println(describe(List("abc","111")))  // List
    // Array[Int], 这里的Int不是真正的泛型
    // java  => String[]
    // scala => Array[String]
    println(describe(List("1", "2", "3")))
    println(describe(Array("abc","fff"))) // something else




  }

}
