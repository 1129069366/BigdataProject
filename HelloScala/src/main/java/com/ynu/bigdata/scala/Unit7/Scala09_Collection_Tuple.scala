package com.ynu.bigdata.scala.Unit7

object Scala09_Collection_Tuple {
  def main(args: Array[String]): Unit = {

    // TODO - 集合 - Tuple 元祖
    // 1, zhangsan, 30      封装在一起,这些数据是毫无关系的  所以不封装成Bean
    // TODO - 集合 - Tuple 元祖
    // 1, zhangsan, 30      如果要把这几个数据封装在一起,这些数据是毫无关系的,所以不封装成Bean
    //List(1, "zhangsan", 30)    可以封装成list的吗?  怎么取zhangsan？ 需要记住位置，但是如果数据有很多呢?  所以也不适合用list
    // scala可以将无关的元素组合在一起，形成一个整体来进行访问，这种整体结构称之元素组合
    // 简称元组 - Tuple
    val t : (Int, String, Int) = (1, "zhangsan", 30)

    println(t._1)
    println(t._2)
    println(t._3)
    // Tuple也是一个集合对象，所以也有类型
    // (Int, String, Int)
    // scala中元组也有专门的类型
    val t1 : Tuple3[Int, String, Int] = (1, "zhangsan", 30)

    // Tuple类型最多存放元素的数量为22个。但是类型是没有约束的。

    println()


  }


  class User {
    var id:Int = 1
    var name:String = "zhangsan"
    var age:Int = 30
  }



}
