package com.ynu.bigdata.scala.Unit7

object Scala12_Collection_Par {
  def main(args: Array[String]): Unit = {

    // 单线程
    val result = (0 to 10).map(x=>{
      Thread.currentThread().getName
    })

    println(result)  // Vector(main, main, main, main, main, main, main, main, main, main, main)

    // 多线程
    val result1 = (0 to 10).par.map(x=>{
      Thread.currentThread().getName
    })

    println(result1)  // ParVector(ForkJoinPool-1-worker-5, ForkJoinPool-1-worker-5, ForkJoinPool-1-worker-7, ForkJoinPool-1-worker-7, ForkJoinPool-1-worker-7, ForkJoinPool-1-worker-3, ForkJoinPool-1-worker-3, ForkJoinPool-1-worker-3, ForkJoinPool-1-worker-1, ForkJoinPool-1-worker-1, ForkJoinPool-1-worker-1)



  }
}
