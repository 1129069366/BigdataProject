package com.ynu.bigdata.scala.Unit5

import scala.Boolean
import scala.collection.immutable.Range.Int


object Scala07_Function {
  def main(args: Array[String]): Unit = {



    def test(f : (Int) => Unit) ={
      println(f(10))
    }

    test{
      (a) => {
        return a + 10
      }
    }



//    def myWhile(op: ()=> Unit) = {    // op是函数名
//      op()
//    }
//
//    val age = 10
//
//    myWhile{                    // mywhile{里面传递函数实现}
//      ()=>{
//        println("uyyyy")
//      }
//    }




//    def test(f: ()=> String ): Unit ={
//      println(f())
//    }
//
//    test{
//      ()=>
//      "ybh"
//    }





//    def myWhile(op: ()=> Boolean) = {    // op是函数名
//
//      if (op()){                 //   op就是直接执行得到返回结果了
//        println("hello ")
//      }
//    }
//
//
//    val age = 10
//    myWhile{
//      () =>
//      age >= 10
//    }



  }
}
