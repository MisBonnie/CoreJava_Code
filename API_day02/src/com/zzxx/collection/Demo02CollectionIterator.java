package com.zzxx.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02CollectionIterator {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("lucy");
        col.add("tom");
        col.add("jack");
        col.add("jack");
        col.add("jack");
        col.add("jack");

        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
