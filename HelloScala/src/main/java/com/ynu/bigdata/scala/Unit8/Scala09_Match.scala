package com.ynu.bigdata.scala.Unit8

object Scala09_Match {
  def main(args: Array[String]): Unit = {
    // TODO - 模式匹配 - 偏函数


    // 将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串
    val list : List[Any] = List(1,2,3,4,5,6,"test")

    // 偏函数的使用
    def partialFun = new PartialFunction[Any,Int] {

      override def isDefinedAt(x: Any) = {
        x.isInstanceOf[Int]
      }

      override def apply(v1: Any) = {
        v1.asInstanceOf[Int] + 1
      }
    }

//    val newlist = list.collect(partialFun)
//    println(newlist)


    // 偏函数的简化1
    def partialFun1 : PartialFunction[Any,Int] = {
      case i:Int => i + 1
    }

    val newlist = list.collect(partialFun1)
    println(newlist)


    // 偏函数的简化2
//    val newlist = list.collect{
//      case i:Int => i+1
//    }


  }
}
