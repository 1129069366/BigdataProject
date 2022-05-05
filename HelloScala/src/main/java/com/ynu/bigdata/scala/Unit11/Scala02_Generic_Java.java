package com.ynu.bigdata.scala.Unit11;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: HelloScala
 * @description
 * @author: Mr.Yang
 * @create: 2022-04-27 15:23
 **/
public class Scala02_Generic_Java {
    public static void main(String[] args) {

        // TODO 5. 泛型和类型不是一个层次，泛型没有所谓的父子关系
        List<String> stringList = new ArrayList<String>();
//      test(stringList);       // 正确

        List<Object> stringList1 = new ArrayList<Object>();
//      test(stringList1);      // 报错

        List<Object> stringList2 = new ArrayList<Object>();
        test2(stringList2);

        List<String> stringList3 = new ArrayList<String>();
//      test2(stringList3);     // 报错


    }

    public static void test( List<String> list ) {
        System.out.println(list);
    }

    public static void test2( List<Object> list ) {
        System.out.println(list);
    }

}
