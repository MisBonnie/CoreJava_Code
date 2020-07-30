package com.zzxx.a_ProducorAndCustomer;

/*
生产者: 包子铺  线程
 run: 1.判断包子状态false
            生产包子 baozi.flag = true
            唤醒吃货线程, 来吃包子
      2.判断包子状态true
            不需要生产
            等待 wait
 */
public class BaoZiPU extends Thread {
    BaoZi baoZi;

    public BaoZiPU(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                // 判断包子状态true
                if (baoZi.flag == true) {
                    try {
                        baoZi.wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 已经被唤醒, 或者包子状态为false
                // 生产包子 baozi.flag = true
                System.out.println("包子铺正在包包子...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baoZi.flag = true;
                baoZi.pi = "冰皮";
                baoZi.xian = "韭菜大葱馅";
                System.out.println("包好了冰皮韭菜大葱馅的包子...");
                // 唤醒吃货线程, 来吃包子
                baoZi.notify();
            }
        }
    }
}

