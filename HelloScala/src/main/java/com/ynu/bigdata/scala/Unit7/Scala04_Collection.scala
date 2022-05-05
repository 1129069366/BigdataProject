package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable.ArrayBuffer

object Scala04_Collection {
  def main(args: Array[String]): Unit = {

    var array = ArrayBuffer(1,2,3,4)

    var buff = ArrayBuffer[Int]()

    // 把array的数字乘2给buff     以下代码体现不了函数式编程的思想
    array.foreach((num)=>{
      buff.append(num*2)
    })
    // buff.foreach(println(_))

    // TODO 功能函数：由集合对象提供函数执行自定义的功能
    //  1. map => 映射(转换) => K->V
    //     a => b
    // val buffer2 = array.map(num => {
    //    num * 2
    // })

    // 简化书写

    val buffer2 = array.map(_*2)
    println(buffer2.mkString(","))


  }




}
