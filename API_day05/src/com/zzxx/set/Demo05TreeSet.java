package com.zzxx.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo05TreeSet {
    public static void main(String[] args) {
        // 可以通过构造方法, 传入比较器
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        set.add("tom");
        set.add("jack");
        set.add("zhangsan");
        set.add("lisi");
        set.add("lisi");
        System.out.println(set);
    }
}
