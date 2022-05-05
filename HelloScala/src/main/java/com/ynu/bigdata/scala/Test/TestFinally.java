package com.ynu.bigdata.scala.Test;

/**
 * @program: HelloScala
 * @description
 * @author: Mr.Yang
 * @create: 2022-04-26 14:23
 **/
public class TestFinally {
    public static void main(String[] args) {

        int j = test();
        System.out.println(j);
    }
    public static int test() {


        // 代码按照顺序执行的时候到return语句,会去判断一下有没有finally，如果有就去执行finally里面的语句。
        // try和finally返回的东西是同一个临时变量


        // 版本1
        // 1 return关键字不会马上返回结果
        // 2 所有的return返回同一个值：临时变量
//        int i = 0;
//        try {
//            return i++;
//            // _temp = i++, _temp = 0, i = 1
//            // return _temp
//        } finally {
//            // _temp = ++i = 2， i = 2, _temp = 2
//            // return _temp
//            // return ++i;
//            return ++i;
//        }

        // 最后结果是2


        // 版本2
        // 1 return关键字不会马上返回结果
        // 2 所有的return返回同一个值：临时变量
        int i = 0;
        try {
            return i++;
            // _temp = i++, _temp = 0, i = 1
            // return _temp
        } finally {
            // _x = ++i =， i = 2, _x = 2
            ++i;
        }

        // 最后结果是0

    }
}
