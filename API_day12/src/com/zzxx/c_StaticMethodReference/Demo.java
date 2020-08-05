package com.zzxx.c_StaticMethodReference;

public class Demo {
    public static int cal(int n, Calcable c) {
        return c.calAbs(n);
    }

    public static void main(String[] args) {
        /*int t = cal(-10, n->{return Math.abs(n);});
        System.out.println(t);*/
        /**
         * 1.方法 已经存在 abs
         * 2.类存在 Math
         */
        // 使用方法引用来优化
        int t = cal(-10, Math::abs);
        System.out.println(t);
    }
}
