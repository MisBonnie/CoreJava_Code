package com.zzxx.api;

import java.util.Scanner;

public class Demo04String {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next();
        char[] arrChar = new char[5];
        // 将字符串切割成每个字符
        for (int i = 0; i < arrChar.length; i++) {
            arrChar[i] = str.charAt(i);
            System.out.println(arrChar[i]);
        }
    }
}
