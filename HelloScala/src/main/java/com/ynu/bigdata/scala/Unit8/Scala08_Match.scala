package com.ynu.bigdata.scala.Unit8

object Scala08_Match {
  def main(args: Array[String]): Unit = {

    // TODO - 模式匹配 - 偏函数

    // 将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串
    val list : List[Any] = List(1,2,3,4,5,6,"test")

    val newlist = list.map{
      case i:Int => i + 1
      case other =>other
    }.filter(_.isInstanceOf[Int])

    println(newlist)   // List(2, 3, 4, 5, 6, 7)


  }
}
