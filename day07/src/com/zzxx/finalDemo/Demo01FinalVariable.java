package com.zzxx.finalDemo;

public class Demo01FinalVariable {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);

        // final修饰局部变量, 只能一次赋值, 不能修改
        final int b; // --> 常量
        b = 20;
//        b = 30;
        System.out.println(b);

        byte b1 = 57;
        b1 = 23 + 34; // 字面量相加, 加完发现在127范围内
        byte b2 = 120;
//        b1 = b2 + 34; // 变量相加, 不确定范围, 认定为int类型, 编译错误
        final byte b3 = 23;
        b1 = b3 + 34; // 常量和字面量, 加完发现范围没有超过
    }
}
