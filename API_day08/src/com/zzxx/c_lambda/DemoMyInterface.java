package com.zzxx.c_lambda;

public class DemoMyInterface {
    public static void main(String[] args) {
        /*int s = method1(new MyInterface() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        });*/
        /*
         调用method1方法, 需要传递MyInterface对象,
         可以使用匿名内部类, 就可以使用lambda表达式优化
         */
        /*int s = method1((int a, int b) -> {
                return a + b;
            }, 1, 3);
        System.out.println(s);*/

        // 继续优化
        int s = method1(
                (a, b) -> a + b
        , 1, 3);
        System.out.println(s);
    }

    // 需要将接口对象作为方法参数, 才可以使用Lambda表达式
    public static int method1(MyInterface in, int a, int b) {
        // 在method1中使用接口对象in的sum方法
        return in.sum(a, b);
    }
}
