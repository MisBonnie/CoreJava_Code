package com.zzxx.thread;

public class Demo01Thread {
    public static void main(String[] args) {
        // 开启多线程任务
        // 步骤3: 创建线程对象
        MyThread1 t = new MyThread1();
        // 步骤4: 开启线程
//        t.run(); // 错误写法
        t.start();
        // 主方法的主线程任务
        for (int i = 0; i < 10; i++) {
            System.out.println("main: " + i);
        }
    }
}
