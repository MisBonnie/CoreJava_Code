package com.zzxx.api;

import java.util.Arrays;

public class Demo06StringAPI2 {
    public static void main(String[] args) {
        String s = " \t    hel   lo \n   ";
        // 1.截取字符串, 从指定位置截取到末尾
        String sub = s.substring(3);
        System.out.println("substring: " + sub);
        // 2.是否以指定字符串开始, 开始位置是offset
        boolean b = s.startsWith("lo", 3);
        System.out.println("startsWith: " + b);
        // 3.获得指定字符串出现的位置
        int index = s.indexOf("qq");
        System.out.println("index: " + index);
        // 4.从指定下标开始往后, 指定字符串第一次出现的位置
        int index1 = s.indexOf("qq", 3);
        System.out.println("index: " + index1);
        // 5.忽略大小写比较
        boolean t = s.equalsIgnoreCase("Hello");
        System.out.println("equals: " + t);

        // 例子: 用户自己输入邮箱地址, 获得对应的用户名

        String trim = s.trim();
        System.out.println(trim);

    }
}
