package com.zzxx.interfaceDemo;

public interface InterfaceDemoB {
    // 不是类, 所以不能有构造方法

    // 接口中的成员变量, 只支持public final static
    // 静态常量
    public static final int NUM = 10;

    // JDK7 只能有公开的抽象方法
    void method1();

    // JDK8 默认方法 - 通常用来做功能扩展
    default void method2() {
        System.out.println("JDK8 才支持的默认的方法");
    }

    // JDK8 静态方法
    static void method3() {
        System.out.println("JDK8 才支持的静态的方法");
    }

    // JDK9 私有方法
    private void method4() {
        System.out.println("JDK9 才支持的私有的方法");
    }
}
