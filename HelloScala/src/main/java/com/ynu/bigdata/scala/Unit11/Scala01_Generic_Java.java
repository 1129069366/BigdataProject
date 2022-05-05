package com.ynu.bigdata.scala.Unit11;

import java.util.*;

/**
 * @program: HelloScala
 * @description
 * @author: Mr.Yang
 * @create: 2022-04-27 15:17
 **/
public class Scala01_Generic_Java {
    public static void main(String[] args) {

        // TODO 1. 泛型和类型的区别？
        // 所谓的类型，其实就是对外部的数据做约束
        // 所谓的泛型，其实就是对内部的数据做约束
        // 泛型和类型的层次不一样。不能作为整体来考虑

        // TODO 2. 泛型在某些场合中，其实就是类型参数，用于向类中传递参数
        Test<User> test = new Test<>();
        // test.t = new Emp()   // 会报错的


        // TODO 3. 泛型其实只在编译时有效,运行时没有, 将这个操作称之为"泛型擦除",反编译的时候没有泛型。


        // TODO 4. 泛型主要目的是为了约束内部数据的类型



    }
}

class Test<T>{
    public T t;
}

class User{

}

class Emp{

}



