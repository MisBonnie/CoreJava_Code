package com.zzxx.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Demo02TreeMap {
    public static void main(String[] args) {
        // 1.有参构造方法创建TreeMap, 传入比较器对象
        Map<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        map.put("lucy", 23);
        map.put("tom", 18);
        // 添加jack的时候, 比较器结果认定jack和lucy相等的, 所以将原来的value值替换
        map.put("jack", 20);
        map.put("zhangsan", 16);

        System.out.println(map);
    }
}
