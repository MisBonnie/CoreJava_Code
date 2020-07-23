package com.zzxx.generic;

import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(1);
        col.add(1.1);
        col.add("hello");
        col.add(new Date());
        col.add(Calendar.getInstance());

        Iterator it = col.iterator();
        while(it.hasNext()) {
            Object o = it.next();
            System.out.println();

        }


    }
}
