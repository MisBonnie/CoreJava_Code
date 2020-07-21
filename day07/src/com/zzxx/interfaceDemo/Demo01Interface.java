package com.zzxx.interfaceDemo;

public class Demo01Interface {
    public static void main(String[] args) {
        // 3.创建实现类对象
        InterfaceAbstractAImpl implA = new InterfaceAbstractAImpl();
        // 调用方法
        implA.abstractMethod();
        implA.abstractMethodB();

        // 调用静态方法, 不能用实现类调用, 写法错误
//        InterfaceAbstractAImpl.staticMethodC();
        // 调用静态方法, 直接通过接口调用
        InterfaceAbstractA.staticMethodC();
    }
}
