package com.zzxx.map;

import java.util.Map;
import java.util.TreeMap;

public class Demo01TreeMap {
    public static void main(String[] args) {
        // 1.无参构造方法创建TreeMap, 没有指定比较器
        Map<String, Integer> map = new TreeMap<>();

        map.put("lucy", 23);
        map.put("tom", 18);
        map.put("jack", 20);
        map.put("zhangsan", 16);

        System.out.println(map);
    }
}
