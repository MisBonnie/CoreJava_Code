package com.zzxx.set;

import java.util.HashSet;
import java.util.Set;

public class Demo01HashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("how");
        set.add("are");
        set.add("you");
        // 不允许重复
        set.add("you");
        // [how, are, hello, you]
        System.out.println(set);
    }
}
