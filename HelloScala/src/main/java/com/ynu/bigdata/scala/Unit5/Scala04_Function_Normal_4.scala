package com.ynu.bigdata.scala.Unit5


object Scala04_Function_Normal_4 {
  def main(args: Array[String]): Unit = {

    def test():()=>Unit = {

      def test1()={
        println("hello ybh")
      }
      test1 _
    }

    test()()




//    def test(f:(Int,Int)=>Int)={
//      println(f(10,20))
//    }
//
//
//
//    test((a,b)=>a+b)
//    test(_+_)



//    def fun2(a:Int,b:Int):Int = a + b
//
//    test(fun2)


//    def fun1()={
//      println("hello ybh")
//    }
//
//    val f = fun1 _
//    test(f)


  }
}
