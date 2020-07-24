package com.zzxx.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo03List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("赵敏");
        list.add("张三丰");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
//            list.remove(s);
            list.remove(i);
            i--;
        }
        System.out.println(list);
    }
}
