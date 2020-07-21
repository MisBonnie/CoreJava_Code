package com.zzxx.demo8;

public class Outer {

    // 成员方法
    public void m1() {
        new Inner();
        new InnerField();
    }
    // 静态方法
    public static void m2() {
        new Inner();
//        new InnerField();
    }
    // 成员内部类
    public class InnerField {

    }
    // 外部类的成员变量
    int a = 10;
    // 外部类的静态成员变量
    static int b = 20;
    // 静态内部类, 属于类的
    public static class Inner {
        public void m3() {
            // 不能使用非静态成员
//            System.out.println(a);
            System.out.println(b);
        }
    }
}
