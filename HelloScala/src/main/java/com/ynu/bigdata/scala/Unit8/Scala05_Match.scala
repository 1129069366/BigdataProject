package com.ynu.bigdata.scala.Unit8

object Scala05_Match {
  def main(args: Array[String]): Unit = {
    // TODO - 模式匹配 - 匹配规则
    // 匹配对象

    val user = User("ybh",23)  // 等同于 val user = User.apply("ybh",23)
    val user1 = User("lmj",24)

    for (user <- Array[User](
      user,user1,User("haha",25)
    )){
      val result: String = user match {
        case User("ybh", 23) => "用户为杨炳辉"
        case User("lmj", 24) => "用户为路梦娟"
        case _ => "啥也不是"
      }
      println(result)
    }
//    输出
//    用户为杨炳辉
//    用户为路梦娟
//    啥也不是

  }
  // 用户类
  class User{
    var name:String = _
    var age :Int = _
  }

  object User{
    // unapply方法 : Object => Attribute  把对象的属性拆解出来 // 必须重写了unapply方法才能在case中使用
    def unapply(user: User): Option[(String,Int)] = {
      Option(user.name,user.age)
    }

    // apply方法 : Attribute => Object    把属性封装成对象
    def apply(name:String,age:Int ):User = {   // apply用来构造对象
      val user = new User()
      user.name = name
      user.age = age
      user
    }

  }

}
