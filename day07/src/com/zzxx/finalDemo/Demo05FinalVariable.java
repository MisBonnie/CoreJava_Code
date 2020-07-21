package com.zzxx.finalDemo;

import com.zzxx.security.Cat;

public class Demo05FinalVariable {
    public static void main(String[] args) {
        final int[] a = {1, 2, 3, 4, 5};
        // final 修饰引用类型变量, 引用-地址不能改变, 对象内容可以改变
        a[0] = 3;
//         a = new int[4];
        final Cat cat = new Cat();
        cat.a_public = 20;
//        cat = new Cat();
    }
}
