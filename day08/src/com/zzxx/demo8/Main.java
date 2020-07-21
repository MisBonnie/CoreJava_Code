package com.zzxx.demo8;

import com.zzxx.demo8.Outer.Inner;

public class Main {
    public static void main(String[] args) {
        // 成员内部类创建对象, 需要外部类对象
        Outer.InnerField inner1 = new Outer().new InnerField();

        // 静态内部类创建对象
        Outer.Inner inner2 = new Outer.Inner();

        // 简化 -> 需要import
        Inner inner3 = new Outer.Inner();

    }
}
