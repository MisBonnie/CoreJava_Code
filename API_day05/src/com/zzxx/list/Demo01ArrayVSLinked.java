package com.zzxx.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo01ArrayVSLinked {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        LinkedList<String> linkList = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            arrList.add(i + "");
            linkList.add(i + "");
        }
        // 1.从列表的头部开始访问
        long time1 = System.currentTimeMillis();
        arrList.get(10);
        long time2 = System.currentTimeMillis();
        System.out.println("ArrayList取头部元素的时间:" + (time2 - time1));

        long time3 = System.currentTimeMillis();
        linkList.get(10);
        long time4 = System.currentTimeMillis();
        System.out.println("LinkedList取头部元素的时间:" + (time4 - time3));
        // 2.从列表的中间部开始访问
        long time5 = System.currentTimeMillis();
        arrList.get(5000000);
        long time6 = System.currentTimeMillis();
        System.out.println("ArrayList取中间取元素的时间:" + (time6 - time5));

        long time7 = System.currentTimeMillis();
        linkList.add(5000000, "ss");
        long time8 = System.currentTimeMillis();
        System.out.println("LinkedList取中间插入元素的时间:" + (time8 - time7));

        // LinkedList独有的方法 - 了解
        linkList.addFirst("");
        linkList.addLast("");
        linkList.removeFirst();
        linkList.removeLast();
        linkList.getFirst();
        linkList.getLast();
    }
}
