package com.zzxx.demo1;

public class Demo {
    // 接口类型作为方法参数
    public MyInterfaceA haha(MyInterfaceA a) {
        // MyInterfaceA a = new MyInterfaceAImpl()

        // a 调用的是哪个方法, 具体看传入的对象是哪个实现类
        a.methodAbs1();
        a.methodAbs2();
        System.out.println("哈哈结束了!");
        // 创建了一个接口的实现类对象, 向上造型为接口类型
        /*MyInterfaceA a1 = new MyInterfaceAImpl();
        // 接口类型的对象 返回
        return a1;*/

        return new MyInterfaceAImpl2();
    }

    public int m1(String a) {
        return 0;
    }

}
