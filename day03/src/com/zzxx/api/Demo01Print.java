package com.zzxx.api;

public class Demo01Print {
    public static void main(String[] args) {
        // 可以不写参数, 就是打印换行
        System.out.println();
        // 不换行, 必须给参数
        System.out.print("\n");
        System.out.println(2);

        // 常见的转义字符   \n->回车  \r->换行  \t->制表符
        // \\->\本身
    }
}
