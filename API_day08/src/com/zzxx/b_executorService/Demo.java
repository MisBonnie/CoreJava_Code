package com.zzxx.b_executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {
    public static void main(String[] args) {
        // 通过线程任务, 来获得线程对象并且直接开始线程
        Runnable run = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        // 创建一个固定线程数量的线程池, 创建好线程池的时候, 就已经有了三个线程对象
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // 将线程任务交给线程池 -- 线程对象可以反复使用
        pool.execute(run);
        Future f = pool.submit(run); // f = null
        pool.submit(run);
        pool.submit(run);


        // 如果没有关闭线程池, 线程对象依然在, 程序就不会结束

        // 手动关闭线程池 - 会自动将里面的线程对象销毁
        pool.shutdown();
    }
}
