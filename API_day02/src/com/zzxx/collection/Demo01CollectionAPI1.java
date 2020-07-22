package com.zzxx.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01CollectionAPI1 {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("haha");
        col.add("xixi");
        col.add("heihei");

        // 移除指定元素
        col.remove("xixi");

        // 是否包含指定元素
        boolean is = col.contains("hehe");
        System.out.println("isContains: " + is);

        // 是否为空 size() == 0
        System.out.println("isEmpty: " + col.isEmpty());

        // 清空集合
        col.clear();
        System.out.println(col);
    }
}
