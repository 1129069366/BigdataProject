package com.ynu.bigdata.scala.Unit7

object Scala06_Collection_Seq {
  def main(args: Array[String]): Unit = {
//     TODO - 集合 - Seq
//    val seq = new Seq()  Seq为trait不能直接构建对象
//    用伴生对象构建
//    val seq = Seq(1,2,3,4)
//     一般会从采用List
    val list = List(1,2,3,4)

//     数据操作
    val ints: List[Int] = list :+ 5
    println(list)    // List(1, 2, 3, 4)
    println(ints)    // List(1, 2, 3, 4, 5)
    println(list eq ints)   // false   集合默认都是不可变的集合


    val ints1: List[Int] = 5 +: list
    println(ints1)   // List(5, 1, 2, 3, 4)

    //    Nil 在集合中表示空集合
    println(Nil)  //  List()
    val init2:List[Int]= 1 :: 2 :: 3 :: Nil
    println(init2)   // List(1, 2, 3)

    // 集合整体放入
    val ints3 = 1 :: 2 :: 3 :: list :: Nil
    println(ints3)  // List(1, 2, 3, List(1, 2, 3, 4))

    // 集合拆成个体放入
    val ints4 = 1 :: 2 :: 3 :: list ::: Nil
    println(ints4)  // List(1, 2, 3, 1, 2, 3, 4)


  }
}
