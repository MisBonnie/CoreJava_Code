package com.zzxx.c_consumer;

import java.util.function.Consumer;

public class Demo02 {
    /**
     * 因为要使用andThen方法, 所以需要两个Consumer对象
     * 并且accept方法需要消费一个对象, 所以还需要一个String对象
     */
    public static void methodAndThen(String str, Consumer<String> con1, Consumer<String> con2) {
        /*con1.accept(str);
        con2.accept(str);*/
        con1.andThen(con2).accept(str);
    }
    public static void main(String[] args) {
        methodAndThen("JavaGood",
                // 第一次消费, 将字符串全部变大写, 并且打印
                s -> {
                    System.out.println(s.toUpperCase());
                },
                // 第2次消费, 将字符串全部变小写, 并且打印
                s -> {
                    System.out.println(s.toLowerCase());
                });
    }
}
