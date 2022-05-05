package com.ynu.bigdata.scala.Unit7

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection_2 {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 方法
    val array = ArrayBuffer(1,2,3,4,5)

    println(array.sum)    // 数据求和
    println(array.max)    // 取最大值
    println(array.min)    // 取最小值
    println(array.product) // 累乘

    // 自定义数据操作的方法
    // 集合的数据无论是多少，最基本的数据操作其实都是两两计算。
    // map => reduce => 简化，规约（聚合）

    def reduceFunction(x : Int, y : Int): Int = {
      x + y
    }

    println(array.reduce(reduceFunction))

    println(array.reduce(_+_))
    println(array.reduceRight(_+_))
    println(array.reduce(_-_))
    println(array.reduceRight(_-_))



  }

}
