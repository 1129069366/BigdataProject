package com.ynu.bigdata.scala.Unit6

object Scala12_Object_Trait_4 {
  def main(args: Array[String]): Unit = {

    // TODO 面向对象 - 特征(特质)

    // java中不能类的多继承 ： 砖石问题
    // scala采用了一种功能叠加的方式解决砖石问题
    // super不是父特质的意思，是上一级（上一个）的意思
    new MySQL().operData()

  }
  trait Operator {
    def operData(): Unit = {
      println("操作数据")
    }
  }
  trait DB extends Operator{
    override def operData(): Unit = {
      print("向数据库中")
      super.operData()
    }
  }
  trait Log extends Operator {
    override def operData(): Unit = {
      print("向日志文件中")
      super[Operator].operData()
    }
  }
  class MySQL extends DB with Log {

  }
}
