package com.zzxx.loop;

public class Demo06DoWhile {
    public static void main(String[] args) {
        int a = 10;
        // 第一次条件就不满足,while一次都不循环
        /*while (a > 10) {
            a --;
        }*/
        // 第一次条件就不满足,do一定会循环一次
        do {
            a--;
        } while(a > 10);
        System.out.println(a);
    }
}
