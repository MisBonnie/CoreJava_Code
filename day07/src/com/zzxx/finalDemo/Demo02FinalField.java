package com.zzxx.finalDemo;

public class Demo02FinalField {
    int a = 10;

    // final 修饰成员变量, 必须初始化: 声明的同时,每个构造方法中,代码块中
    final int b;
    {
        b = 10;
    }
    Demo02FinalField() {

    }
    Demo02FinalField(int a) {

    }

    public static void main(String[] args) {
        Demo02FinalField demo2 = new Demo02FinalField();
        demo2.a ++;
        System.out.println(demo2.a);

//        demo2.b ++; // b是常量, 不能修改
    }
}
