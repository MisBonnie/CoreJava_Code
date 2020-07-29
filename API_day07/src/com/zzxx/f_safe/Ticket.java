package com.zzxx.f_safe;

// 模拟当前票的余量
public class Ticket {
    // 票的余量是100张
    public int count = 100;
    private Object object = new Object();
    /*
      在方法上加锁, 称为同步方法锁
      锁在方法上, 实际上就是在this对象上加锁
     */
    /*public synchronized void saleTicket() {
        if (count == 0) {
            throw new RuntimeException("票卖完了!");
        }
        System.out.println(Thread.currentThread().getName()+"正在出票: " + count);
        count--;

        System.out.println(Thread.currentThread().getName()+"卖完一张票");
    }*/
    /*
      synchronized使用原则: 尽量将少的代码加锁
      可以只将一部分代码加锁, 同步代码锁, 需要借助一个对象
      加锁的对象: 可以是任意对象, 只需要确保多个同步的线程, 对象唯一就可以了
                 通常使用this对象
      对象锁: 一个对象只能加一把锁, 并且只能同时被一个线程持有
     */
    public void saleTicket() {
//        synchronized (this) {
        synchronized (object) {
            if (count == 0) {
                throw new RuntimeException("票卖完了!");
            }
            System.out.println(Thread.currentThread().getName() + "正在出票: " + count);
            count--;
        }

        System.out.println(Thread.currentThread().getName()+"卖完一张票");
    }
}
