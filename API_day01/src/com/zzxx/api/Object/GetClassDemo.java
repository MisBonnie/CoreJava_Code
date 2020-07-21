package com.zzxx.api.Object;

public class GetClassDemo {
    public static void main(String[] args) {
        Class c1 = "haha".getClass();
        Class c2 = "hi".getClass();
        // 同种类型的对象, 对应的字节码对象都是同一个
        System.out.println(c1 == c2);
    }
}
