package com.zzxx.d_predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 数组当中有多条“姓名+性别”的信息如下，
 * { "迪丽热巴,女", "古力娜扎,女", "⻢尔扎哈,男", "赵丽颖,女" };
 * 请通过 Predicate 接口的拼装将符合要求的字符串筛选到集合 ArrayList 中，
 * 需要同时满足两个条件:
 * 1. 必须为女生;
 * 2. 姓名为4个字。
 */
public class Demo05Test {
    public static boolean filterName(String str, Predicate<String> p1, Predicate<String> p2) {
        boolean b = p1.and(p2).test(str);
        return b;
    }
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "⻢尔扎哈,男", "赵丽颖,女" };
        ArrayList<String> list = new ArrayList<>();
        for (String str : array) {
            boolean b = filterName(str,
                    // 1.必须为女生;
                    s -> s.split(",")[1].equals("女"),
                    // 2.姓名为4个字。
                    s -> s.split(",")[0].length() == 4
            );
            if (b) {
                list.add(str);
            }
        }

        System.out.println(list);
    }

}
