package com.zzxx.arrayList;

import java.util.ArrayList;

public class Demo02ArrayListAPI {
    public static void main(String[] args) {
        // 增\删\查
        ArrayList<String> list = new ArrayList();
        System.out.println("size: " + list.size());
        // 向集合中添加元素, 参数: 要加的元素
        list.add("haha");
        list.add("heihei");
        list.add("hehe");
        list.add("xixi");
        list.add("hiahia");
        list.add("wawa");
        list.add("yaya");
        System.out.println(list);

        // 从集合中删除元素, 参数: 下标
        String remove = list.remove(4);
        System.out.println(list);
        System.out.println("remove: " + remove);

        // 从集合中获得元素  arr[3]
        String get = list.get(3);
        System.out.println("get: " + get);

        // 获得集合中元素的个数 - 长度
        int size = list.size();
        System.out.println("size: " + size);
        // 遍历集合
    }
}
