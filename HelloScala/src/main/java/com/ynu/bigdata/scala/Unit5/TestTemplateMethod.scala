package com.ynu.bigdata.scala.Unit5

object TestTemplateMethod {
  def main(args: Array[String]): Unit = {

    TM.execute{
      ()=> {
        println(",,,,")
      }
    }


  }
}

object TM{

  def startTransaction() = {
    println("开始事务。。。")
  }


  def execute(op: ()=>Unit): Unit ={
    startTransaction()
    op()
    endTransaction()
  }

  def endTransaction() = {
    println("结束事务。。。")
  }


}
