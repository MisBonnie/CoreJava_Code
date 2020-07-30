package com.zzxx.b_executorService;

import java.util.Date;
import java.util.concurrent.*;

public class Demo02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建一个固定线程数量的线程池, 创建好线程池的时候, 就已经有了三个线程对象
        ExecutorService pool = Executors.newFixedThreadPool(3);
        // 通过线程任务, 来获得线程对象并且直接开始线程
        Callable run = new Callable<Date>() {
            @Override
            public Date call() throws Exception {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
                Thread.sleep(10000);
                return new Date();
            }
        };
        // 将线程任务交给线程池 -- 线程对象可以反复使用
        Future<Date> f = pool.submit(run);
        Date d = f.get(); // 得到Callable里面call方法的返回值
        System.out.println(d);

        /*try {
            Date date = f.get(3, TimeUnit.SECONDS);
            System.out.println(date);
        } catch (TimeoutException e) {
            System.out.println("结果超时了");
        }*/
        System.out.println("主线程继续");
        // 如果没有关闭线程池, 线程对象依然在, 程序就不会结束

        // 手动关闭线程池 - 会自动将里面的线程对象销毁
        pool.shutdown();
    }
}
