package com.zzxx.f_stream;

import java.util.stream.Stream;

public class Demo04Filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("喜羊羊", "张飞", "张三丰", "周瑜", "孙悟空");
        /*stream.filter((String name)->{
            // 想要保留的对象条件是..
            return name.length() == 3;
        });*/
        // 优化写法
        stream.filter(name -> name.length() == 3)
        .forEach( name -> System.out.println(name));
    }
}
