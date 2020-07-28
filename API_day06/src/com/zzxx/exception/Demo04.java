package com.zzxx.exception;

import java.util.Scanner;

// try-catch-finally
// return 和 finally 顺序
public class Demo04 {
    public static void main(String[] args) {
        int i = method1();
        System.out.println("main: " + i);
    }
    public static int method1() {
        int a = 10;
        Scanner console = new Scanner(System.in);
        try {
            a += 20;
            return a; // 30
        } catch (RuntimeException e){
            System.out.println("捕获到运行时异常了");
            return 0;
        } finally {
            a ++;
            System.out.println("finally 代码块: " + a); // 31
            console.close();
        }
    }
}
