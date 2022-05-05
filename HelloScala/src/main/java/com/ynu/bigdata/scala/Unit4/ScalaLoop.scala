package com.ynu.bigdata.scala.Unit4

import scala.collection.immutable
import scala.util.control.Breaks
import scala.util.control.Breaks._

object ScalaLoop {

  def main(args: Array[String]): Unit = {

    breakable {
      for (i: Int <- 1 to 10) {
        if (i == 3){
          break
        }
        println(s"i is ${i}")
      }
    }





//    Breaks.breakable{
//
//      for (i :Int <- 1 to 10){
//        if (i == 3){
//          Breaks.break
//        }
//        println(s"i is ${i}")
//      }
//
//
//    }



//    val result = for (i <- Range(1,5)) yield{
//      i * 2
//    }
//
//    println(result)
//
//    var i = 0
//    while(i <= 5){
//      println(i)
//      i+=1
//    }
//
//
//    var i = 1
//    do{
//      println(i)
//      i+=1
//    }while(i <=0)



  }
}
