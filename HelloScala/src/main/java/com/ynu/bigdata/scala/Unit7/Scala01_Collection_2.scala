package com.ynu.bigdata.scala.Unit7

object Scala01_Collection_2 {
  // main方法是静态的  所以写在了伴生对象中
  def main(args: Array[String]): Unit = {
    // todo 多维数组
    var matrix = Array.ofDim[String](3,3)  // 三行三列

    matrix(0) = Array[String]("a","b","c")
    matrix(1) = Array[String]("d","e","f")
    matrix(2) = Array[String]("g","h","i")

//    普通遍历
//    for (list <- matrix){
//      println(list.mkString(" "))
//    }


//    foreach遍历
//    matrix.foreach(list=>println(list.mkString(",")))


    val arr1 = Array(1,2,3,4)
    val arr2 = Array(5,6,7,8)

    //合并数组
    val array1 = Array(1,2,3,4,5)
    val array2 = Array(6,7,8,9,10)

    val concatArray = Array.concat(array1,array2)
//    println(concatArray.mkString(","))


    // 创建指定范围的数组
    val arr3 = Array.range(0,5)
//    arr3.foreach(print(_))     //01234

    // 创建并填充指定数量的数组
    val arr4:Array[Int] = Array.fill[Int](5)(-1);   // 长度为5 默认值都是-1的数组
    arr4.foreach(println)

  }
}
