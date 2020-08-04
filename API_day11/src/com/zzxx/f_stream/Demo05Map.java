package com.zzxx.f_stream;

import java.util.stream.Stream;

public class Demo05Map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("12", "34.5", "65.1", "3.14");

        // 将这个 String 转换成 Integer
        /*stream.map((String s)->{return Integer.valueOf(s);});*/
        Stream<Double> stream1 = stream.map(s -> Double.valueOf(s));
        stream1.forEach(i-> System.out.println(i));
    }
}
