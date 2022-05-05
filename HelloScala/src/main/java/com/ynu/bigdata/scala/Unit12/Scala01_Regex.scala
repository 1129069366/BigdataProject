package com.ynu.bigdata.scala.Unit12

object Scala01_Regex {
  def main(args: Array[String]): Unit = {

    // TODO 正则表达式
    // 正则表达式和模式匹配很像
    // 模式匹配匹配的是规则：类型，常量，元组，集合，数组，对象，参数
    // 正则表达式也是匹配规则：String

    // 1. 声明规则

    val regex = "gan".r

    // 2. 准备数据
    val data = "zhangsan"

    // 3. 使用规则校验数据

    val maybeString: Option[String] = regex.findFirstIn(data)
    if (maybeString.isEmpty){
      println("不符合规则")
    }else{
      println("符合规则："+maybeString.get)
    }







  }
}
