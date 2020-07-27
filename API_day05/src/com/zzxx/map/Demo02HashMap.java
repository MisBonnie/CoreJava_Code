package com.zzxx.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 遍历方式1: 将map中的key的部分, 单独取出, 成为set, 遍历这个set
public class Demo02HashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("张三","12334345");
        map.put("李四","3245345");
        map.put("王五","567890");
        map.put("赵六","98765432");

        Set<String> set = map.keySet();
        // 遍历key
        for (String key:set) {
            // 通过key获得value
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
