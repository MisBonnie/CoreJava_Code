package com.zzxx.d_predicate;

import java.util.function.Predicate;

public class Demo03Or {
    public static void strPredicate(String str, Predicate<String> pre1, Predicate<String> pre2) {
        // boolean b = pre1.test(str) || pre2.test(str);

        boolean b1 = pre1.or(pre2).test(str);
        System.out.println(b1);
    }
    public static void main(String[] args) {
        strPredicate("Hello Tony!",
                s -> s.split(" ").length > 0,
                s -> s.endsWith("!"));
    }
}
