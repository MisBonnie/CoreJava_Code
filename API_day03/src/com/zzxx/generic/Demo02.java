package com.zzxx.generic;

import java.util.*;

public class Demo02 {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList();

        col.add("hello");
        col.add("hi");
        m1(col);
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s.length());
        }
    }
    public static void m1(Collection c) {
        c.add(1);
    }
}
