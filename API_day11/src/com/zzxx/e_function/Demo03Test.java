package com.zzxx.e_function;

import java.util.function.Function;

/**
 * String str = "赵丽颖, 20";
 * 1. 将字符串截取数字年龄部分，得到字符串;
 *      "赵丽颖, 20" -> "20"   Function<String, String>
 * 2. 将上一步的字符串转换成为int类型的数字;
 *      "20" -> 20     Function<String, Integer>
 * 3. 将上一步的int数字累加100，得到结果int数字。
 *      20 -> 120      Function<Integer, Integer>
 */
public class Demo03Test {
    public static void change(String str, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        int i = fun1.andThen(fun2).andThen(fun3).apply(str);
        System.out.println(i);
    }
    public static void main(String[] args) {
        change("赵丽颖, 20",
               // "赵丽颖, 20" -> "20"
               s -> s.split("[, ]+")[1],
               // "20" -> 20
               s -> Integer.valueOf(s),
               // 20 -> 120
               i -> i + 100 );
    }
}
