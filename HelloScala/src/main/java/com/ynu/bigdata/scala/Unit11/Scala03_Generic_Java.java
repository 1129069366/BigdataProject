package com.ynu.bigdata.scala.Unit11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Scala03_Generic_Java {
    public static void main(String[] args) {

        // TODO 6. 泛型的不可变   前后的泛型要一样
        List<Child> childList = new ArrayList<Child>();
        //List<Child> childList1 = new ArrayList<Parent>();    //报错
        //List<Child> childList2 = new ArrayList<SubChild>();  // 报错
    }
}
class Parent {

}
class Child extends Parent {

}
class SubChild extends Child {

}

