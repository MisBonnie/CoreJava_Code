package com.zzxx.c_lambda;

public class DemoMyInterface2 {
    public static void main(String[] args) {
        // 调用method1, 需要传MyInterface2接口对象
        method1(new MyInterface2() {
            @Override
            public int echo(String str) {
                return str.length();
            }
        }, "hello");

        // 使用Lambda简化
        method1((String str) -> {
                return str.length();
            }, "hello");

        // 继续优化
        method1(str -> str.length(), "hello");
    }


    // 必须要有一个以接口对象作为参数的方法
    public static int method1(MyInterface2 in, String str) {
        // 在方法内部, 调用接口的函数
        return in.echo(str);
    }
}
