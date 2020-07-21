package com.zzxx.interfaceDemo;

public class Demo02 {
    public static void main(String[] args) {
        InterfaceDefaultImpl impl = new InterfaceDefaultImpl();
        // 调用普通方法
        impl.methodAbs1();
        // 调用默认方法, 类中如果没有这个方法, 向上级找
        impl.defaultMethod();

        InterfaceDefaultImplB implB = new InterfaceDefaultImplB();
        implB.methodAbs1();
        // 类中重写了接口的default方法, 调用时, 就会使用重写后的方法
        implB.defaultMethod();
    }
}
