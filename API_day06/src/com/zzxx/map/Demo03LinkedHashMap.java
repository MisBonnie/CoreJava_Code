package com.zzxx.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo03LinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("lucy", "有点傻");
        map.put("jack", "有点呆");
        map.put("tom", "有点蠢");
        map.put("rose", "有点萌");
        // 结果: 按照插入顺序排列, 有序的
        System.out.println(map);
    }
}
