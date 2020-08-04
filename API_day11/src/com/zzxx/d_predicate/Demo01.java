package com.zzxx.d_predicate;

import java.util.function.Predicate;

public class Demo01 {

    public static void method01(String str, Predicate<String> pre) {
        boolean b = pre.test(str);
        System.out.println(b);
    }

    public static void main(String[] args) {
        method01("张靓颖", (s) -> {
            return s.length() == 2;
        });
    }
}
