package com.zzxx.demo7;


public class Outer {
    public static void main(String[] args) {
        // 匿名内部类本质: 实现接口或者继承抽象类
        /*
            new MyInterfaceA(){..}
            new: 创建MyInterfaceA 的实现类对象
            MyInterfaceA: 想要实现的接口, 抽象类
            {..}: 真正的类, 没有名字
            弊端: 只能用一次, 只能创建一次对象
         */
         MyInterfaceA impl = new MyInterfaceA() {
             int a = 10;
            @Override
            public void methodAbs1() {
                System.out.println("内部类实现1" + a++);
            }
            @Override
            public void methodAbs2() {
                System.out.println("内部类实现2");
            }
        };
        impl.methodAbs1();
        impl.methodAbs2();

        new MyInterfaceA() {
            int a = 10;
            @Override
            public void methodAbs1() {
                System.out.println("内部类实现1" + a++);
            }
            @Override
            public void methodAbs2() {
                System.out.println("内部类实现2");
            }
        }.methodAbs1();
        // 匿名对象, 只能调用一次方法
        new Outer().getClass();
        new Outer().hashCode();
    }
}
