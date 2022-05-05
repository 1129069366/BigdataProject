package com.ynu.bigdata.scala.Unit2.InAndOut

import java.io.OutputStream
import java.net.Socket


object TestClient {
  def main(args: Array[String]): Unit = {
    //连接服务器
    val client = new Socket("localhost",9000)

    val outputStream: OutputStream = client.getOutputStream
    outputStream.write(1)
    outputStream.flush()
    outputStream.close()
    println("客户端发送数据1")

    client.close()
  }
}
