package com.zzxx.e_function;

import java.util.function.Function;

public class Demo01 {
    // String -> Integer
    public static void change(String str, Function<String, Integer> fun) {
        int i = fun.apply(str);
        System.out.println(i);
    }

    public static void main(String[] args) {
        change("123", s -> Integer.valueOf(s));
    }
}
