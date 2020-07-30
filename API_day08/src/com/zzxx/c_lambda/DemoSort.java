package com.zzxx.c_lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoSort {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // List.of() -> 固定的集合
        List<String> list = List.of("lucy", "heihei", "zhangsan");
        list = new ArrayList<>(list);

        /*Collections.sort(list, new Compa
        rator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });*/
        // 使用Lambda表达式优化
        Collections.sort(list, (String o1, String o2) -> {
                return o1.length() - o2.length();
            });

        // 继续优化
        Collections.sort(list, (o1, o2) ->
            o1.length() - o2.length());

        System.out.println(list);
    }
}
