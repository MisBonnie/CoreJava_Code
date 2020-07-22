package com.zzxx.string;

public class Demo04Concat {
    public static void main(String[] args) {
        /*String str = "";
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            str = str + i;
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);*/
        StringBuilder sb = new StringBuilder("");
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.append(i);
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
}
