package com.zzxx.map;

import java.util.HashMap;
import java.util.Map;

public class Demo01HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        // 1.向map集合中添加元素 key-value
        String s = map.put(3, "张三");
        map.put(4, "张三");
        map.put(1, "张三");
        map.put(2, "李四");
        // {1=张三, 2=李四, 3=张三, 4=张三} -> toString重写过了
        System.out.println("put返回值: " + s); // null
        System.out.println(map);
        // 2.从集合中移除元素 key-value, 返回移除掉的value
        String s2 = map.remove(1);
        System.out.println("remove返回值: " + s2);
        System.out.println(map);
        // 3.将集合中的元素修改
        String s3 = map.put(3, "王五");
        System.out.println("put返回值: " + s3); // 张三
        System.out.println(map);
        // 4.获得map集合中的元素 value, 不存在的key, 对应的null
        String s4 = map.get(5);
        System.out.println("get返回值: " + s4); // 王五
        System.out.println(map);
    }
}
