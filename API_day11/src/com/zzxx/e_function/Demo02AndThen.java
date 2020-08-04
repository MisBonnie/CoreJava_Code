package com.zzxx.e_function;

import java.util.function.Function;

public class Demo02AndThen {
    // 将 "123" -> 转换成 int 后 +10
    //      String->Integer  Function<String, Integer>
    // 将 加完后的 int 值, 转换成 String, 16进制的格式
    //      Integer->String  Function<Integer, String>
    public static void change(String str, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        /*Integer i = fun1.apply(str);
        i += 10;

        String string = fun2.apply(i);
        System.out.println(string);*/
        String result = fun1.andThen(fun2).apply(str);
        System.out.println(result);
    }

    public static void main(String[] args) {
        change("123",
                s -> Integer.valueOf(s) + 10,
                i -> Integer.toBinaryString(i));
    }
}
