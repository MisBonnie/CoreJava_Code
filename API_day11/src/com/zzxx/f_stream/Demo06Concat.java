package com.zzxx.f_stream;

import java.util.stream.Stream;

public class Demo06Concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("喜羊羊", "美羊羊", "懒洋洋", "暖洋洋");
        Stream<String> stream2 = Stream.of("张飞", "关羽", "刘备");

        // 静态方法
        Stream<String> stream = Stream.concat(stream1, stream2);
        stream.forEach(s-> System.out.println(s));
    }
}
