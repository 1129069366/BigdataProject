package com.ynu.bigdata.scala.Unit11

object Scala04_Generic {
  def main(args: Array[String]): Unit = {



    // 定义一个隐式值  Test[Parent]类型
    implicit val t : Test[Parent] = new Test[Parent]
    // 定义一个函数
    def f[A : Test](a: A) = println(a)
    f( new Parent() )



  }
  class Test[T] {
  }
  class Parent {
  }
  class User extends Parent{
  }
  class SubUser extends User {
  }

}
