package com.ynu.gmall.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.interceptor.Interceptor;

import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/**
 * @program: Collect0224
 * @description
 * @author: Mr.Yang
 * @create: 2022-03-13 17:10
 **/
public class EtlLogInterceptor implements Interceptor {
    public void initialize() {

    }

    public Event intercept(Event event) {
        //1. 取出body
        String body = new String(event.getBody(), StandardCharsets.UTF_8);
        // 2.判断是否合法
        try {

            JSON.parseObject(body);
        }catch (JSONException e){
            return null;
        }

        return event;
    }

    public List<Event> intercept(List<Event> list) {
        Iterator<Event> iterator = list.iterator();
        while (iterator.hasNext()){
            Event event = iterator.next();
            Event result = intercept(event);
            if(result == null){
                iterator.remove();
            }
        }
        return list;
    }

    public void close() {

    }

    public static class MyBuilder implements  Builder{

        @Override
        public Interceptor build() {
            return new EtlLogInterceptor();
        }

        @Override
        public void configure(Context context) {

        }
    }

}
