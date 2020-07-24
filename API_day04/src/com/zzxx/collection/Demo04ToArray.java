package com.zzxx.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Demo04ToArray {
    public static void main(String[] args) {
        /*Collection col = new ArrayList();
        col.add("hello");
        col.add(3.14);
        col.add(1);
        col.add(new Date());

        Object[] os = col.toArray();
        for (Object o : os) {
            System.out.println(o);
        }*/
        m1();
    }

    public static void m1() {
        Collection<String> col = new ArrayList();
        col.add("hello");
        col.add("hi");
        /*
            toArray方法参数: 具体类型的数组, 长度无所谓
                      只是为了提供类型
            返回值的数组类型, 取决于参数的数组类型
            返回值的数组长度, 取决于集合的长度
         */
        String[] ss = col.toArray(new String[0]);
        for (String s : ss) {
            System.out.println(s.length());
        }
    }
}
