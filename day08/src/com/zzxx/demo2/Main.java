package com.zzxx.demo2;

public class Main {
    public static void main(String[] args) {
        // 父类型引用 指向 子类型对象
        Fu f = new Zi();
        // 无关类 不叫 向上造型, 写法错误
//        Fu f1 = new Self();
        // 以下两种不叫多态
        Fu f1 = new Fu();
        Zi zi = new Zi();
    }
}
