package com.zzxx.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// 遍历方式2: 键值对封装成一个整体-Entry, Set<Entry>
public class Demo03HashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("张三","12334345");
        map.put("李四","3245345");
        map.put("王五","567890");
        map.put("赵六","98765432");

        Set<Entry<String, String>> set = map.entrySet();
        for (Entry<String, String> en:set) {
            // 获得key
            String key = en.getKey();
            String value = en.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
