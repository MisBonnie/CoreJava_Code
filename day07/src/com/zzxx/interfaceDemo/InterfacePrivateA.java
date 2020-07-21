package com.zzxx.interfaceDemo;

public interface InterfacePrivateA {
    void methodAbs();
    default void methodDefaultA() {
        System.out.println("默认方法A");
        methodPrivateA();
    }

    default void methodDefaultB() {
        System.out.println("默认方法B");
        methodPrivateA();
    }
    // 静态方法中, 不能直接调用普通成员方法
    static void methodStaticA() {
        // 写法错误
//        methodPrivateA();
        System.out.println("静态方法A");
        methodPrivateB();
    }
    static void methodStaticB() {
        System.out.println("静态方法B");
        methodPrivateB();
    }

    private static void methodPrivateB() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
    private void methodPrivateA() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
