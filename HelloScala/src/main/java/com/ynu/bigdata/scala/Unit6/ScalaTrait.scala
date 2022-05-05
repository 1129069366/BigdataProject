package com.ynu.bigdata.scala.Unit6

object ScalaTrait {
  def main(args: Array[String]): Unit = {
    val mysql = new MySQL()
    mysql.print()


  }
}

trait Operator {
  def print(): Unit ={
    println("operator")
  }
}

trait DB {
  def print(): Unit ={
    println("DB")
  }
}

class MySQL extends DB with Operator{
  override def print(): Unit ={
    println("MySQL")
  }
}
