package com.zzxx.a_lambda;

public class Demo01 {
    public static void print(String s, Printable p) {
        p.print(s);
    }

    public static void main(String[] args) {
        /**
         * s -> System.out.println(s)
         * 1.参数s 直接传给了 println 方法使用
         * 2.System.out 对象本身就是存在的
         * 3.println() 这个方法本身也是存在的
         * 4.println方法的参数就是 接口方法的参数
         * -- 就可以简化
         */
        /*print("Hello Lambda",
                s -> {System.out.println(s);});*/
        // 使用 方法引用 来简化Lambda
        print("Hello Lambda", System.out::println);
    }
}
