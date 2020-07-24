package com.zzxx.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo04Sort {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("lucy");
        ls.add("zhangsan");
        ls.add("tom");
        ls.add("lisi");
        ls.add("jack");
        System.out.println("排序之前: " + ls);
        Collections.sort(ls);
        System.out.println("字典排序之后: " + ls);

        // 按照字符串长度来排序, 长的在前面, 短的在后面
        Collections.sort(ls, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println("长短排序之后: " + ls);
    }
}
