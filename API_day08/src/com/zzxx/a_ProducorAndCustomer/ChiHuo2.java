package com.zzxx.a_ProducorAndCustomer;

/*
消费者: 吃货 线程
  run: 1.判断包子状态false
           等待包子铺生产包子
       2.判断包子状态true
           吃包子 baozi.flag = false
           唤醒包子铺线程
 */
public class ChiHuo2 extends Thread {
    BaoZi baoZi;

    public ChiHuo2(BaoZi baoZi, String name) {
        super(name);
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                // 1.判断包子状态false 等待包子铺生产包子
                if (baoZi.flag == false) {
                    System.out.println(getName() + "在等包子铺包包子");
                    try {
                        baoZi.wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 运行到这里, 要么是包子状态true, 要么被唤醒了
                // 吃包子 baozi.flag = false
                System.out.println(getName() + "开始吃" + baoZi.pi + baoZi.xian + "的包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baoZi.flag = false;
                System.out.println(getName() + "吃完包子");
                // 唤醒包子铺线程
//              baoZi.notifyAll();
                baoZi.notify();
            }
        }
    }
}

