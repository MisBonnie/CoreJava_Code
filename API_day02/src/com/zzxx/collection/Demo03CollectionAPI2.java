package com.zzxx.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03CollectionAPI2 {
    public static void main(String[] args) {
        Collection<String> col1 = new ArrayList<>();
        col1.add("小李飞刀");
        col1.add("西门吹雪");

        Collection<String> col2 = new ArrayList<>();
        col2.add("令狐冲");
        col2.add("任盈盈");

        col1.addAll(col2);

        System.out.println(col1);
        System.out.println(col2);

        Collection<String> col3 = new ArrayList<>();
        col3.add("东方不败");
        col3.add("令狐冲");
        boolean b = col1.containsAll(col3);
        System.out.println(b); // false

        // col1: [小李飞刀, 西门吹雪, 令狐冲, 任盈盈]
        Collection<String> col4 = new ArrayList<>();
        col4.add("任我行");
        col4.add("任盈盈");
        col4.add("令狐冲");
        col1.retainAll(col4);
        System.out.println(col1);

        // col1: [令狐冲, 任盈盈]
        Collection<String> col5 = new ArrayList<>();
        col5.add("东方不败");
        col5.add("令狐冲");
        col1.removeAll(col5);
        System.out.println(col1);

    }
}
