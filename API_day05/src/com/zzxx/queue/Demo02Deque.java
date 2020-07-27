package com.zzxx.queue;

import java.util.Deque;
import java.util.LinkedList;

public class Demo02Deque {
    public static void main(String[] args) {
        // 1.创建一个双端队列的方法
        Deque<String> dq = new LinkedList<>();
        // 2.拥有队列相关的所有方法 offer peek poll
        dq.offer("哈哈哈");
        dq.offer("嘻嘻嘻");
        // 3.可以从队列头和尾加元素
        dq.offerFirst("hahaha");
        dq.offerLast("heihei"); // 等同于offer方法
        System.out.println(dq);
        // 4.可以从队列头和尾取元素
        String s1 = dq.pollFirst(); // 等同于poll
        System.out.println("队列头: " + s1);
        System.out.println("队列: " + dq);

        s1 = dq.pollLast();
        System.out.println("队列尾: " + s1);
        System.out.println("队列: " + dq);
    }
}
