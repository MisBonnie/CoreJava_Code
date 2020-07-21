package com.zzxx.demo6;


public class Outer {
    public void m1() {
        class InnerImpl implements MyInterfaceA {
            @Override
            public void methodAbs1() {
                System.out.println("内部类实现1");
            }
            @Override
            public void methodAbs2() {
                System.out.println("内部类实现2");
            }
        }

        // 使用接口的方法, 创建接口的实现类
        InnerImpl impl = new InnerImpl();
        impl.methodAbs1();
        impl.methodAbs2();
    }
}
