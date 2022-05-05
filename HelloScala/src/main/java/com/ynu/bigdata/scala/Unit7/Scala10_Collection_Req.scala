package com.ynu.bigdata.scala.Unit7

object Scala10_Collection_Req {
  def main(args: Array[String]): Unit = {
    // TODO - 集合 - 需求
    // 不同省份的商品点击排行
    // word(省份-商品) - count（1）
    val datas = List(
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "帽子"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "电脑"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "电脑"),
      ("zhangsan", "河南", "电脑"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子")
    )

    // TODO 将原始数据进行结构的转换
    // (人，省份，商品) => (省份-商品， 1)
    val mapDatas = datas.map(
      t => {
        (t._2 + "-" + t._3, 1)
      }
    )
    // TODO 将转换结构后的数据进行分组
    val groupDatas: Map[String, List[(String, Int)]] = mapDatas.groupBy(_._1)

    // TODO 将分组后的数据进行统计聚合
    val cntDatas = groupDatas.mapValues(
      list => list.size
    )
    //println(cntDatas)
    // TODO 将聚合的结果进行结构的转换
    // 将相同省份的数据准备放在一起
    // (省份-商品， count) => (省份，（商品，count）)
    val mapDatas1 = cntDatas.toList.map(
      kv => {
        val k = kv._1
        val cnt = kv._2
        val ks = k.split("-")
        (ks(0), (ks(1), cnt))
      }
    )
    // println(mapDatas1)
    // 河北 => List( (衣服，20），(鞋，10)，.... )
    // TODO 将转换结构后的数据进行排序（降序）
    val groupDatas1 =
    mapDatas1.groupBy(_._1).mapValues(
      list=> {
        list.map(_._2).sortBy(_._2)(Ordering.Int.reverse).take(3)
      }
    )





//    println(groupDatas1)






  }
}
