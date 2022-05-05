package com.ynu.bigdata.scala.Unit11

object Scala03_Generic {
  def main(args: Array[String]): Unit = {


    // def reduce[A1 >: A](op: (A1, A1) => A1): A1     reduce[A1 >: A]  操作的是A1 所以A1必须是A的父类
    // A是声明集合的时候声明的泛型   而操作可以返回的是A的父类 如下正确
    val list:List[Child] = List(
      new Child(),new Child(),new Child()
    )
//    val parent: Parent = list.reduce[Parent](
//      (p1, p2) => {
//        p1
//      }
//    )


    // 这下面的就会报错
//    val list:List[Child] = List(
//      new Child(),new Child(),new Child()
//    )
//    val subchild: SubChild = list.reduce[SubChild](
//      (p1, p2) => {
//        p1
//      }
//    )

    // list.fold[Parent](new Parent)((x,y)=>x)  // 正确
    // list.fold[SubChild](new SubChild)((x,y)=>x) //报错



  }
  class Parent{}

  class Child extends Parent{}

  class SubChild extends Child{}


}
