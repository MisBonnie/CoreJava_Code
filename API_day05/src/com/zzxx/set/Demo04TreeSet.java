package com.zzxx.set;

import java.util.Set;
import java.util.TreeSet;

public class Demo04TreeSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("tom");
        set.add("jack");
        set.add("zhangsan");
        set.add("lisi");
        set.add("lisi");
        System.out.println(set);
    }
}
