package com.ynu.bigdata.scala.Test;

/**
 * @program: HelloScala
 * @description
 * @author: Mr.Yang
 * @create: 2022-04-25 09:05
 **/
public class TestSwitch {
    public static void main(String[] args) {

        // switch : 多重分支判断
        // 1. switch穿透现象(不一定是错误)
        // 2. default位置

        // scala语言中没有switch语法
        int age = 20;
        switch (age) {
            case 10 :
                System.out.println("age = 10");
                //break;
            case 30 :
                System.out.println("age = 30");
                break;
//            default :
//                System.out.println("other");
//                break;
        }
    }
}
