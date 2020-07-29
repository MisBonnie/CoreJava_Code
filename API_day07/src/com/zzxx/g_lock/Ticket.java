package com.zzxx.g_lock;

import java.util.concurrent.locks.ReentrantLock;

// 模拟当前票的余量
public class Ticket {
    // 票的余量是100张
    public int count = 100;
    // 创建锁对象
    private ReentrantLock lock = new ReentrantLock();

    public void saleTicket() {
        // 加上锁
        lock.lock();

        if (count == 0) {
            throw new RuntimeException("票卖完了!");
        }
        System.out.println(Thread.currentThread().getName() + "正在出票: " + count);
        count--;

        // 打开锁
        lock.unlock();

        System.out.println(Thread.currentThread().getName() + "卖完一张票");
    }
}
