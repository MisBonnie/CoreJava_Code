package com.zzxx.sub;

public class Demo01Extends {
    public static void main(String[] args) {
        Dog d = new Dog("旺财");
        // name是在父类中声明的, 子类可以直接使用
        System.out.println(d.name);
//        d.name = "旺财";
        d.eat(); // 子类方法
//        d.wang();
    }
}
