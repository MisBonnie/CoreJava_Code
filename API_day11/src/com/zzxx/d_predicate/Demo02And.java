package com.zzxx.d_predicate;

import java.util.function.Predicate;

public class Demo02And {
    public static void strPredicate(String str, Predicate<String> pre1, Predicate<String> pre2) {
        /*boolean b1 = pre1.test(str);
        boolean b2 = pre2.test(str);
        System.out.println(b1 && b2);*/

        boolean b = pre1.and(pre2).test(str);
        System.out.println(b);
    }
    public static void main(String[] args) {
        strPredicate("Hello Tony!",
                s -> s.length() > 10,
                s -> s.startsWith("H"));
    }
}
