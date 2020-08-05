package com.zzxx.b_ObjectMethodReference;

public class Demo {
    public static void method1(String s, Printable p) {
        p.print(s);
    }

    public static void main(String[] args) {
       /* method1("hello", s -> {
            // 1.先创建MyObjectMethod对象
            MyObjectMethod obj = new MyObjectMethod();
            // 2.调用 printUpperCase 这个方法
            obj.printUpperCase(s);
        });*/

        // 使用方法引用来优化
        /*
            1.对象已经存在 obj
            2.方法已经存在 printUpperCase
         */
        MyObjectMethod obj = new MyObjectMethod();
        method1("hello", obj::printUpperCase);
    }
}
