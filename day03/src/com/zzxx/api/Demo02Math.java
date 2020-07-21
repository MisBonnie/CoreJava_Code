package com.zzxx.api;

/**
 * Math数学类讲解
 */
public class Demo02Math {
    public static void main(String[] args) {
        // random() -> [0,1)
        double rand = Math.random();
        System.out.println(rand);
        // [0,20)
        double r1 = Math.random() * 20;
        System.out.println(r1);

        // [0, 100) 整数
        int r2 = (int) (Math.random() * 100);
        System.out.println(r2);

        // [65, 90]   [0,1)->[0,26)->[65,91)
        int r3 = (int) (Math.random() * 26 + 'a');
        // 就是随机大写字母
        char c = (char) (Math.random() * 26 + 65);
        char c1 = (char) (Math.random() * 26 + 'A');

        System.out.println(c);
        System.out.println(c1);

        System.out.println("---------");
        // double Math.pow(double, double)   3 ^ 6
        int pow = (int) Math.pow(2, 10);
        System.out.println(pow);
    }
}
