package com.ynu.bigdata.spark.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object Spark19_RDD_Oper_Transform_1 {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(conf)

    val rdd = sc.makeRDD(
      List(
        (new User("ybh", 23),1), (new User("lmj", 24),2), (new User("lsz", 24),3), (new User("lyq", 18),4)
      ),2
    )

    // 按照年龄升序排序
    val soryByUserAge: RDD[(User, Int)] = rdd.sortByKey(true)
    soryByUserAge.collect.foreach(println(_))

    sc.stop()

  }



  class User() extends Ordered[User] with Serializable {


    override def toString: String = {
      return this.name + " :" + this.age
    }

    var name:String = _
    var age:Int = _

    def this(name:String,age:Int){
      this()
      this.name = name
      this.age = age
    }


    // 表示年龄大的在前
    override def compare(that: User): Int = {
      this.age - that.age
    }
  }



}
