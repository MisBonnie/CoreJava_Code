package com.zzxx.api;

public class Demo03StringConstructor {
    public static void main(String[] args) {
        // 1.简单写法
        String s = "hello";
        // 2.无参构造器 -> "" 空的字符串
        String s1 = new String();
        // 3.有参构造 1 -> hello
        String s2 = new String("hello");
        // 4.有参构造 2 -> hello
        char[] chs = {'h','e','l','l','o'};
        String s3 = new String(chs);
        // 5.有参构造 3 -> ell
        String s4 = new String(chs, 1, 3);
        // 6.有参构造 4 -> bcde
        byte[] bs = {98, 99, 100, 101};
        String s5 = new String(bs);
        // 7.有参构造 5 -> cde
        String s6 = new String(bs, 1, 3);
    }
}
