package com.zzxx.demo4;

// 外部类
public class Body {
    public void walk() {
        System.out.println("身体在行走");
        // 外部类中, 直接创建内部类对象
        Heart heart = new Heart();
        heart.beat();
        // 外部类中使用内部类成员变量, 需要内部类对象
        System.out.println(heart.num);
        System.out.println(a); // 外部类的a
    }
    private int a = 10;
    // 成员内部类: 成分和外部类一样
    public class Heart {
        int num;
        int a = 20;
        public void beat() {
            int a = 30;
            // 内部类中可以直接使用外部类成员
            System.out.println("心脏跳动" + a++);
            // 内部类的成员a
            System.out.println(this.a);
            // 外部类的成员变量a
            System.out.println(Body.this.a);
        }
    }
}
