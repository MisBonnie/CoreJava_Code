package com.zzxx.demo1;

public class Main2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        String s = "";
        String s1 = new String("");
        // 调用方法并且接收返回值
        int a = d.m1(s1);

//        MyInterfaceA a1 = new MyInterfaceAImpl();
        MyInterfaceAImpl a1 = new MyInterfaceAImpl();
        // 调用方法并且接收返回值
        MyInterfaceA re = d.haha(a1);

    }
}
