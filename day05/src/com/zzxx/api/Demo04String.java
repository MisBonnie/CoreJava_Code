package com.zzxx.api;

public class Demo04String {
    public static void main(String[] args) {
        // 构造方式的区别
        // 1.直接赋值
        // 2.new出来的
        String s1 = new String("hello");
        String s2 = new String("hello");
        // 判断s1和s2是否相等
        System.out.println(s1 == s2); // false

        String s3 = "hello";
        String s4 = "hello";
        System.out.println(s3 == s4); // true
        System.out.println(s3 == s1); // false
        // 字符串字面量/直接量 的拼接, 出来的还是直接赋值
        String s5 = "he" + "llo";
        System.out.println(s4 == s5); // true
        String s6 = "he";
        // 变量和直接量的拼接, 产生一个新的对象
        String s7 = s6 + "llo";
        System.out.println(s4 == s7); // false
    }
}
