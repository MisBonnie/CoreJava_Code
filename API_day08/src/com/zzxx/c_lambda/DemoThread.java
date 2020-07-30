package com.zzxx.c_lambda;

public class DemoThread {
    public static void main(String[] args) {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("----");
            }
        }).start();*/

        // 使用Lambda表达式优化
        new Thread(() -> {
                System.out.println("----");
            }).start();
        // 继续优化
        new Thread(() -> System.out.println("----")
        ).start();
    }
}
