package com.zzxx.demo1;

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        // 创建接口的实现类对象
        MyInterfaceAImpl a = new MyInterfaceAImpl();
        // 参数需要一个 MyInterfaceA 类型
        // 实际参数: 可以是接口的实现类 对象
        d.haha(a);

        MyInterfaceAImpl2 a2 = new MyInterfaceAImpl2();
        // 写法错误, 返回值类型规定是 MyInterfaceA
//        MyInterfaceAImpl2 re = d.haha(a2);
        // 正确写法
        MyInterfaceA re = d.haha(a2);



    }

}
