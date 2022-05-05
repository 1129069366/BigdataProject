package com.ynu.bigdata.scala.Unit11

object Scala01_Generic {
  def main(args: Array[String]): Unit = {
    // TODO Scala中的泛型和java中的泛型大同小异
    // 1. scala中的泛型采用中括号
    // 2. scala中的泛型也是不可变的
    // 3. 马丁想，泛型和类型不是一个层面的东西，所以无法联合使用，不方便
    //          如果能将类型和泛型当成一个整体来使用的话，那不就方便了吗？
    //          如果将类型和泛型联合使用，那么类型相同时，如果泛型存在父子类关系，那么联合的类型也就存在父子类关系
    //            这个操作其实就是一种变化，称之为协变, +T

    //          如果类型相同，泛型之间存在父子关系，那么让联合后的类型存在子父关系
    //            这个操作其实也是一种变化，称之为逆变, -T

    // scala中的泛型也是不可变的
    val message1:Message[Child] = new Message[Child]


    // [+T]斜变
    // Child(子)             Parent(父)
    // MessageChild(父)      MessageParent（子）
//    val message2:Message[Parent] = new Message[Child]   // 正确
    // val message2:Message[Child] = new Message[Parent]   // 报错   [-T] 时会正确


    // [-T]逆变
    // Child(父) -> child -> SubChild（子）
    // MessageChild(子)          MessageSubChild（父）
    // val message3:Message[SubChild] = new Message[Child]  // 正确
    // val message3:Message[Child] = new Message[SubChild] // 报错   [+T]时会正确


  }

  class  Message[T]{}

  class Parent{}

  class Child extends Parent{}

  class SubChild extends Child{}

}
