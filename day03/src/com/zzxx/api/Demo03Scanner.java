package com.zzxx.api;

import java.util.Scanner;

public class Demo03Scanner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // 遇到回车, 才读取结束
        String s1 = console.nextLine();
        System.out.println("字符串: " + s1);

        int a = console.nextInt();
        System.out.println("整数: " + a);

        double d = console.nextDouble();
        System.out.println("小数: " + d);

        // 遇到空格或者回车, 就读取结束
        String s = console.next();
        System.out.println("next字符串: " + s);
    }
}
