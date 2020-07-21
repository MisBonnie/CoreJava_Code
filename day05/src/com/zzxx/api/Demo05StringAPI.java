package com.zzxx.api;

import java.util.Arrays;

public class Demo05StringAPI {
    public static void main(String[] args) {
        String s = "hello@qq.com";
        String s1 = new String("hello");
        // 1.获得某一个下标对应的字符
        char c = s.charAt(0);
        System.out.println("charAt: " + c);
        // 2.字符串比较不能用 s==s1  s1==s
        boolean b = s1.equals(s); // s.equals(s1)
        System.out.println("equals: " + b);
        // 3.将字符串s, 转换成字符数组
        char[] chs = s.toCharArray();
        System.out.println("toCharArray: " + Arrays.toString(chs));
        // 4.统计字符串中的字符个数, 长度
        int length = s.length();
        System.out.println("length: " + length);
        // 5.判断是否以xx开头 +86
        boolean b1 = s.startsWith("+86");
        System.out.println("startsWith: " + b1);
        // 6.判断是否以xx结尾 @qq.com
        boolean b2 = s.endsWith("@qq.com");
        System.out.println("endsWith: " + b2);
        // 7.获得字符串中指定字符第一次出现的位置, 没有字符, 返回-1
        int index = s.indexOf('@');
        System.out.println("indexOf: " + index);
        // 8.截取字符串, s本身没变
        String sub = s.substring(0, 5);
        System.out.println("substring: " + sub);
    }
}
