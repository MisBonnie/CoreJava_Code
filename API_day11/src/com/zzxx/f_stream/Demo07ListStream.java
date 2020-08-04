package com.zzxx.f_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo07ListStream {
    public static void main(String[] args) {
        //第一支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        //第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        // 1. 第一个队伍只要名字为3个字的成员姓名;存储到一个新集合中。
        // 2. 第一个队伍筛选之后只要前3个人;存储到一个新集合中。
        Stream<String> stream1 = one.stream().filter(name -> name.length() == 3)
                .limit(3);
        // 3. 第二个队伍只要姓张的成员姓名;存储到一个新集合中。
        // 4. 第二个队伍筛选之后不要前2个人;存储到一个新集合中。
        Stream<String> stream2 = two.stream().filter(name->name.startsWith("张"))
                .skip(2);
        // 5. 将两个队伍合并为一个队伍;存储到一个新集合中。
        Stream<String> newStream = Stream.concat(stream1, stream2);
        // 6. 根据姓名创建Person对象;存储到一个新集合中。
        Stream<Person> personStream = newStream.map(name -> new Person(name));
        // 7. 打印整个队伍的Person对象信息。
        personStream.forEach(p -> System.out.println(p));
    }
}
