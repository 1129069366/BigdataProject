package com.ynu.bigdata.scala.Unit11

object Scala02_Generic {

  def main(args: Array[String]): Unit = {

    // TODO Scala中的泛型也存在上限和下限的概念
    // 这里的上限和下限采用的是颜文字   使用 _ 代替 ?
    val p = new Producer[Child]
    //p.produce(new Message[Child])
    //p.produce(new Message[Parent])
    //p.produce(new Message[SubChild])

    val c = new Consumer[Child]
    val m: Message[_ <: Child] = c.consume()
    val data: Child = m.data


  }
  class Message[T] {
    var data : T = _
  }
  class Parent {}

  class Child extends Parent {}

  class SubChild extends Child {}
  class Producer[T] {
    def produce( message : Message[_ >: T] ): Unit = {

    }
  }
  class Consumer[T] {
    def consume(): Message[_ <: T] = {
      null
    }
  }
}

