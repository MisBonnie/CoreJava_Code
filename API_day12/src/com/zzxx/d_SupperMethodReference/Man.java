package com.zzxx.d_SupperMethodReference;

public class Man extends Human {
    // 重写的父类的hi方法
    public void hi(String message) {
        System.out.println("Hi Man!" + message);
    }
    // 定义一个sayHello, 目的是为了传入Lambda表达式
    public void sayHello(String s, Greetable g) {
        g.greet(s);
    }
    // 这个方法的目的, 是为了调用 sayHello
    public void show() {
       /* sayHello("吃了吗", s->{
            // 调用父类的hi方法
            super.hi(s);
        });*/
        /**
         * 1.super对象已存在
         * 2.方法hi已存在
         */
        sayHello("吃了吗", super::hi);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
