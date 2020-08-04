package com.zzxx.c_consumer;

import java.util.function.Consumer;

public class Demo01 {
    /*
        为了使用Lambda表达式, 需要将Consumer接口作为方法参数
        因为Consumer接口的accept方法需要一个对象来消费, 所以再多传入一个String参数
     */
    public static void toUpper(String str, Consumer<String> consumer) {
        consumer.accept(str);
    }

    public static void main(String[] args) {
        toUpper("hello", s -> {
            // 在这里写消费/使用这个s对象的代码
            // 我的消费方式: 将 s 进行反转
            String str = new StringBuilder(s).reverse().toString();
            System.out.println(str);
        });
    }
}
