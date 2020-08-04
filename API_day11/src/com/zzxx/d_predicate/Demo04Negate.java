package com.zzxx.d_predicate;

import java.util.function.Predicate;

public class Demo04Negate {
    public static void m1(String str, Predicate<String> pre) {
        /*boolean b = pre.test(str);
        System.out.println(!b);*/

        boolean b1 = pre.negate().test(str);
        System.out.println(b1);
    }
    public static void main(String[] args) {
        m1("hello Tony !",
                s -> s.split(" ")[1].length() > 3);
    }
}
