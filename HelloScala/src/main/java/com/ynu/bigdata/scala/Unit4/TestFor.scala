package com.ynu.bigdata.scala.Unit4


object TestFor {
  def main(args: Array[String]): Unit = {



    for (i <- Range(1,9);j = 2*i-1;k = 8-i){
      println(" "*k+"*"*j);
    }

//    for (i <- Range(1,9);j = 2*i-1){
//      println("*"*j);
//    }


//    for (i <- Range(1,7);j <- 1.to(5)){
//
//      println(""+i+j);
//
//    }

//
//    for (i <- Range(1,7)){
//      for (j <- 1.to(5)) {
//        println("" + i + j);
//      }
//    }

//
//    for (i <- Range(1,6,2)){
//      println(i)
//    }


    //    for(i:Int <- 1 to 5){
//      printf(s"i is : ${i}\n")
//      println(s"i is : ${i}")
//      println("i is : %s",i)
//      printf("i is : %s\n",i)
//
//    }


//    for (i:Int <- Range(1,5)){
//      println(s"i is ${i}")
//    }

//    for (i <- Range(1,6) if i != 3){
//      println(i)
//    }


  }
}
