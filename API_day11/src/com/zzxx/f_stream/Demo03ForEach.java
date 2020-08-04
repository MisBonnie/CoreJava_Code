package com.zzxx.f_stream;

import java.util.List;
import java.util.stream.Stream;

public class Demo03ForEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("喜羊羊", "张飞", "张三丰", "周瑜", "孙悟空");
        // stream流自带内部迭代
        // forEach 是一个终结方法
        stream.forEach((String s) -> {
            // 消费这个s对象
            s = s.substring(1);
            System.out.println(s + "...");
        });
    }
}
