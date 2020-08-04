package com.zzxx.f_stream;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Demo02GetStream {
    public static void main(String[] args) {
        // 1.单列集合获得流对象 List Set
        // List -> Stream
        List<String> list = List.of("喜羊羊", "美羊羊","懒洋洋","暖洋洋");
        Stream<String> streamList = list.stream();
        // Set -> Stream
        Set<String> set = Set.of("张无忌", "张三丰", "张翠山", "张飞");
        Stream<String> streamSet = set.stream();

        // 2.多列集合 Map
        Map<Integer, String> map = Map.of(1, "张飞", 2, "关羽", 3, "刘备", 4, "周瑜");
        // 获得map中的key
        Set<Integer> keys = map.keySet();
        Stream<Integer> streamKey = keys.stream();
        // 获得map中 key-value对 entry
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Stream<Map.Entry<Integer, String>> streamEntry = entries.stream();
        // 获得value部分
        Collection<String> values = map.values();
        Stream<String> streamValues = values.stream();

        // 3.数组获得Stream流的方式
        Integer[] arrInt = {1,2,3,4,5};
        Stream<Integer> streamInt = Stream.of(arrInt);

        // 4.传入数组的方式可以使用可变长参数替代
        Stream<Integer> streamInt2 = Stream.of(1, 2, 3, 4, 5);

    }
}
