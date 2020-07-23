package com.zzxx.list;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("鲁智深");
        list.add("宋江");
        // 插入元素
        list.add(1, "时迁");

        System.out.println(list);
        // 删除 1 位置上的元素
        list.remove(1);
        System.out.println(list);
    }
}
