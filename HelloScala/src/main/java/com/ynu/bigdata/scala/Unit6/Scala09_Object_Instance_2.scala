package com.ynu.bigdata.scala.Unit6

object Scala09_Object_Instance_2 {
  def main(args: Array[String]): Unit = {

    /*     java的方式  给构造器上的参数赋值
         class User {
             private String name;
             public User( String name ) {
                 this.name = name;
             }
         }
        */



    var u = new User(name = "ybh",age = 23)
    println(u.name)
    println(u.age)

  }

  class User(){      // 主构造器

    var name:String = _

    var age:Int = _

    def this(name:String,age:Int){
      this()
      this.name = name
      this.age = age
    }

  }


}



