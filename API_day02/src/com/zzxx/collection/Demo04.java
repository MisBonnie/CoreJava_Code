package com.zzxx.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo04 {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("lucy");
        c1.add("鲁智深");
        c1.add("及时雨");
        c1.add("宋江");
        c1.add("lucy");
        System.out.println(c1);
        // 只删除匹配的第一个元素
//        c1.remove("lucy");
//        System.out.println(c1);
        //  c1.removeAll("lucy"); // 用法错误 ! ! !

        Collection<String> c2 = new ArrayList<>();
        c2.add("lucy");
        c1.removeAll(c2);

        System.out.println(c1);
    }
}
