package com.zzxx.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2ForEach {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("鲁智深");
        col.add("西门庆");
        col.add("潘金莲");
        col.add("武大郎");
        col.add("武松");
        // : 右边 -> 要迭代的集合/数组
        // : 左边 -> 每一次迭代取出的那个元素
        //          等同于迭代器中的 String s = it.next()
        for (String s : col) {
            System.out.println(s);
        }
        System.out.println("-------------");
        int[] arr = {5, 12, 7, 3, 1};
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
