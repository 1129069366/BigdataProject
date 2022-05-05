package com.ynu.bigdata.scala.Unit9

import java.io.FileInputStream

object Scala01_Exception {
  def main(args: Array[String]): Unit = {

    // TODO - 异常

    // 异常： 编译时异常 & 运行时异常
    // 编译器为了程序的健壮性，提示开发者，代码是会有问题的，应该想办法针对于不同的问题来解决
    // 使用try catch处理异常，发生异常后面的代码还会继续执行。但是通过thrwos抛出异常的话，没有人处理，最终会导致程序奔溃。

//    val i = 0
//    val j = 10 / i

    // 马丁知道大家都不知道异常是什么
    // 所以scala中异常没有分类  也没有抛出的概念
    // new FileInputStream("xxxx")

    try{
      val i = 0
      val j = 10 / i
//      new FileInputStream("xxxx")
    }catch {
      case e:Exception => println("其他异常")              // 模式匹配 先匹配到就不往下走了。所以Exception大异常可以放在前面,但是java不行。
      case e:ArithmeticException => println("算术异常")
    }

    println("the end ")
  }
}
