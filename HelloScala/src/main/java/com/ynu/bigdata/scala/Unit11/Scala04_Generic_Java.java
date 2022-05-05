package com.ynu.bigdata.scala.Unit11;

/**
 * @program: HelloScala
 * @description
 * @author: Mr.Yang
 * @create: 2022-04-27 16:02
 **/
public class Scala04_Generic_Java {
    public static void main(String[] args) {

        // TODO 7. 为了使用方便，可以定义泛型的边界
        Producer<C> producer = new Producer<>();
        producer.produce(new Message<P>());
        producer.produce(new Message<C>());
//        producer.produce(new Message<SC>());  //这里会报错

        Consumer<C> c = new Consumer<C>();
        Message<? extends C> message = c.getMessage();
//        final Child data = message.data;

    }
}

class C extends P{

}

class P{

}

class SC extends C{

}


class Message<T>{

}

class Producer<A>{
    public void produce(Message<? super A > message){

    }
}

class Consumer<B>{
    public Message<? extends B> getMessage(){
        return null;
    }
}

