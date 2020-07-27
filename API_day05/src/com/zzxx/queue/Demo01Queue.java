package com.zzxx.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demo01Queue {
    public static void main(String[] args) {
        // 1.创建队列 - 先进先出
        Queue<String> qu = new LinkedList<>();
        // 2.进队列的方法
        qu.offer("哈哈哈");
        qu.offer("嘻嘻嘻");
        System.out.println(qu);
        // 3.获取队列头元素的方法
        String s1 = qu.peek(); // -- 只是查看访问
        System.out.println("队列头: " + s1);
        System.out.println("队列: " + qu);
        s1 = qu.poll(); // -- 获取队列头元素,并将元素从队列中移除
        System.out.println("队列头2: " + s1);
        System.out.println("队列2: " + qu);
    }
}
