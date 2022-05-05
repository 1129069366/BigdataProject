package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable.ArrayBuffer

object Scala04_Collection_1 {
  def main(args: Array[String]): Unit = {

//    var array = ArrayBuffer(
//      ArrayBuffer(1,2),ArrayBuffer(3,4),
//      ArrayBuffer(5,6),ArrayBuffer(7,8)
//    )

    // println(array)   ArrayBuffer(ArrayBuffer(1, 2), ArrayBuffer(3, 4), ArrayBuffer(5, 6), ArrayBuffer(7, 8))
    //println(array.length)    长度为4
    // 将整体拆分成个体的操作，称之为扁平化
    //println(array.flatten)   // ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8)


    // 扁平化一次只能对最外层进行操作
//    val array = ArrayBuffer(
//        ArrayBuffer(
//            ArrayBuffer(1,2),ArrayBuffer(5,6)
//        ), ArrayBuffer(
//            ArrayBuffer(3,4),ArrayBuffer(7,8)
//        )
//    )
    // println(array.flatten)   ArrayBuffer(ArrayBuffer(1, 2), ArrayBuffer(5, 6), ArrayBuffer(3, 4), ArrayBuffer(7, 8))
    // println(array.flatten.flatten)  ArrayBuffer(1, 2, 5, 6, 3, 4, 7, 8)

    // 能否把字符串拆分成一个个单词?
    val array = Array(
      "Hello Scala", "Hello Hadoop"
    )
    // 扁平化的时候把字符串看成了char字符数组，所以拆成了一个个字母
    //println(array.flatten.mkString(","))  H,e,l,l,o, ,S,c,a,l,a,H,e,l,l,o, ,H,a,d,o,o,p

    //需要自定义扁平化
    println(array.flatMap(str => {
      str.split(" ")
    }).mkString(" "))





  }
}
