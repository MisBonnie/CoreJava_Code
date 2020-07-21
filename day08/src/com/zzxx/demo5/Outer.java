package com.zzxx.demo5;

public class Outer {
    private int b = 20;
    public void m1() {
        // 和局部内部类同方法的局部变量 a
        /*final */int a = 10;
        class Inner {
            public void innerM1() {
                int c = 0;
                System.out.println("局部内部类m1" + a);
                System.out.println("成员变量: " + b);
            }
        }
        Inner i = new Inner();
        i.innerM1();
//        a ++;
        b ++;
    }
    public void m2() {
//        System.out.println(a);
    }
}
