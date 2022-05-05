package com.ynu.bigdata.scala.Unit2.InAndOut

import java.net.{ServerSocket, Socket}


object TestServer {

  def main(args: Array[String]): Unit = {

    val server = new ServerSocket(9000)

    // 服务器接收消息   会阻塞
    val client = server.accept()

    val in = client.getInputStream

    val i: Int = in.read()
    println("从客户端接收的数据为 " + i)
    in.close()



  }

}
