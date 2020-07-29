package com.zzxx.d_priority;

public class Demo {
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                Thread t = Thread.currentThread();
                for (int i = 0; i < 10; i++) {
                    System.out.println(t.getName() + ": " + i);
                }
            }
        };

        Thread t1 = new Thread(run, "线程1");
        Thread t2 = new Thread(run, "线程2");
        Thread t3 = new Thread(run, "线程3");
        // 默认优先级, 都是5
        /*System.out.println("t1: " + t1.getPriority());
        System.out.println("t2: " + t2.getPriority());
        System.out.println("t3: " + t3.getPriority());*/

        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(10); // 最大优先级
        t1.start();
        t2.start();
        t3.start();
    }
}
