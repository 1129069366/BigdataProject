package com.ynu.bigdata.scala.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: HelloScala
 * @description
 * @author: Mr.Yang
 * @create: 2022-04-26 15:06
 **/
public class TestClassCastException {
    public static void main(String[] args) {

        // 类型转换异常演示
        List list = new ArrayList();

        list.add("123");
        list.add(123);

        List<User> list1 = list;
        for (User user : list1){
            System.out.println(user);
        }

        // 空指针异常  调用空对象的成员变量或者方法
        //
        List list2 = null;
        for (Object obj : list2){    // 这里调用了吗?   增强for底层是利用迭代器实现的,所以又使用成员方法
            System.out.println(obj);
        }


    }
}

class User{

}
