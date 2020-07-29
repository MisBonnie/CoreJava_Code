package com.zzxx.e_daemon;

public class Demo {
    public static void main(String[] args) {
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    // 制造延迟, 让线程暂停一下
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("I will jump!");
                }
                System.out.println("aa a a a a a");
                System.out.println("噗通...!");
            }
        };

        Runnable run2 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("you jump, I jump!");
                }
            }
        };

        Thread rose = new Thread(run1);
        Thread jack = new Thread(run2);
        // 默认所有线程都不是守护线程
//        System.out.println("jack是不是守护线程: " + jack.isDaemon());
        // 设置守护线程
        jack.setDaemon(true);

        rose.start();
        jack.start();
    }
}
