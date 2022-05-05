package com.ynu.bigdata.scala.Unit8

object Scala03_Match {
  def main(args: Array[String]): Unit = {

//    // TODO - 模式匹配 - 匹配规则
//    // 匹配数组：判断给定的数组的规则
//    for(arr <- Array(
//      Array(0),
//      Array(1, 0),
//      Array(0, 1, 0),
//      Array(1, 1, 0),
//      Array(1, 1, 0, 1),
//      Array("hello", 90,1)
//    )){
//
//      val result = arr match {
//
//        case Array(0) => "0"
//        case Array(x,y)=> x + "," + y
//        case Array(0,_*)=>"以0开头的数组"
//        case Array(1,_*)=>"以1开头的数组"
//        case _ => "something else"
//      }
//
//      println("result:" + result)
//
//    }

//    result:0
//    result:1,0
//    result:以0开头的数组
//    result:以1开头的数组
//    result:以1开头的数组
//    result:something else

    // 匹配列表
//    for (list <- Array(
//        List(0),
//        List(1, 0),
//        List(0, 0, 0),
//        List(1, 0, 0),
//        List(88))) {
//        val result = list match {
//            case List(0) => "0" //匹配List(0)
//            case List(x, y) => x + "," + y //匹配有两个元素的List
//            case List(0, _*) => "0 ..."
//            case _ => "something else"
//        }
//
//        println(result)
//    }


    // list中head tail ; init last的理解方式
//    val list: List[Int] = List(1)
//
//    // 1::Nil
//    println(list.head)     // 1
//    println(list.tail)     // List()
//
//    //List().append(1)
//    println(list.init)     // List()
//    println(list.last)     // 1
//

//  val list: List[Int] = List(1)  // 输出  //  something else
//    val list: List[Int] = List(1,2)  // 输出  //  1-2-List()
//    list match {
//        case first :: second :: rest => println(first + "-" + second + "-" + rest)  // 1 :: 2:: Nil 这种方式理解
//        case _ => println("something else")
//    }
//

    // 匹配元祖
    for (tuple <- Array(
      (0, 1),
      (1, 0),
      (1, 1),
      (1, 0, 2)
    )){

      val result = tuple match {
        case (0,_)=>"0 ...."


      }
    }

  }





}
