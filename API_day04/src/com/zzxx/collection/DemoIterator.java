package com.zzxx.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("鲁智深");
        col.add("西门庆");
        col.add("潘金莲");
        col.add("武大郎");
        col.add("武松");

        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            // 迭代访问
            String s = it.next();
            // 打印对象
            System.out.println(s);
            // 将s对象删除
//            col.remove(s);
            it.remove();
        }

    }
}
