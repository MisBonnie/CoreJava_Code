package com.zzxx.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// 遍历方式3: 将map中的value部分获取出来, 成为List, 遍历这个List
// 弊端: 就只能遍历值, 不能遍历键, 因为map不能反向映射
public class Demo04HashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("张三","12334345");
        map.put("李四","3245345");
        map.put("王五","567890");
        map.put("赵六","98765432");

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
