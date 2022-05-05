package com.ynu.bigdata.scala.Unit8

object Scala06_Match {
  def main(args: Array[String]): Unit = {

    for (user <- Array(
      User("ybh",23),User("lmj",25),User("hha",25)
    )){

      user match {
        case User("ybh",23) => println("用户是杨炳辉")
        case User("lmj",25) => println("用户是路梦娟")
        case User("hha",25) => println("啥也不是")
      }

    }

  }

  // 如果在类的前面的增加case关键字，这个类专门用于模式匹配，称之为样例类
  // 在编译时，会自动生成大量的方法
  // 1. 样例类会自动实现可序列化接口
  // 2. 样例类的构造参数直接能够作为属性使用，但是不能修改，如果想要修改，需要将参数使用var声明
  // 3. 增加和重写了大量的方法
  // 4. 样例类自动生成伴生对象，而且其中自动声明了apply，unapply
  case class User(var name:String,var age:Int)

}
