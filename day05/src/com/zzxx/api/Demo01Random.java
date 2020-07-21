package com.zzxx.api;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        // 1.创建Random对象
        Random ran = new Random();
        // 2.使用方法
        int a = ran.nextInt();
        System.out.println(a);
        // 0~20之间随机数
        int b = ran.nextInt(20);
        System.out.println(b);
        // 产生一个随机boolean值
        boolean c = ran.nextBoolean();
        System.out.println(c);
    }
}
