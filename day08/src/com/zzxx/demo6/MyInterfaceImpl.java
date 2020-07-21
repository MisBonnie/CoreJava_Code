package com.zzxx.demo6;

// 只想用一次, 只想在Outer类中的m1方法中使用
public class MyInterfaceImpl implements MyInterfaceA {
    @Override
    public void methodAbs1() {
        System.out.println("方法1");
    }

    @Override
    public void methodAbs2() {
        System.out.println("方法2");
    }
}
