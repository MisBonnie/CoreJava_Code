package com.zzxx.f_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张翠山");
        list.add("赵敏");
        list.add("殷素素");
        list.add("周芷若");
        list.add("谢逊");

        // 1. 第一个队伍只要名字为3个字的成员姓名;存储到一个新集合中。
        /*List<String> list2 = new ArrayList<>();
        for (String name : list) {
            if (name.length() == 3) {
                list2.add(name);
            }
        }*/
        // 优化第一步
        // a.获得集合list对应的Stream
        Stream<String> stream = list.stream();
        stream.filter(s->s.length() == 3)
                .forEach(System.out::println);

        // 2. 第一个队伍筛选之后只要前3个人;存储到一个新集合中。
        /*List<String> list3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list3.add(list2.get(i));
        }*/
        // 3. 第二个队伍只要姓张的成员姓名;存储到一个新集合中。
        /*List<String> list4 = new ArrayList<>();
        for (String name : list4) {
            if (name.startsWith("张")) {
                list4.add(name);
            }
        }*/
        // 4. 第二个队伍筛选之后不要前2个人;存储到一个新集合中。
        // 5. 将两个队伍合并为一个队伍;存储到一个新集合中。
        // 6. 根据姓名创建Person对象;存储到一个新集合中。
        // 7. 打印整个队伍的Person对象信息。

    }
}
