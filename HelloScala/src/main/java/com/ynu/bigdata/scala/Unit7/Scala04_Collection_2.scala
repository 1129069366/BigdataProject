package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable.ArrayBuffer

object Scala04_Collection_2 {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 方法
    val array = ArrayBuffer(1,2,3,4)
    // filter方法可以对集合中的每一条数据进行筛选过滤
    // 满足条件（true）的数据保留，不满足条件(false)的数据丢弃
    // 全部留下
//    val r = array.filter(
//        num=> {
//          true
//        }
//    )
//    println(r)    // ArrayBuffer(1, 2, 3, 4)

    // 保留下偶数
    val res: ArrayBuffer[Int] = array.filter(num => {
      num % 2 == 0
    })
    println(res)    // ArrayBuffer(2, 4)



  }
}
