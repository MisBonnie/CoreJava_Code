package com.zzxx.api2;

public class Demo03System {
    public static void main(String[] args) {
        // 获得当前系统时间 - 毫秒
        long time = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 1000000000; i++){
            // 建议频繁的字符串拼接, 不要使用 +
            str = str + i;
        }
        long time1 = System.currentTimeMillis();
        // 计算代码执行效率(时间差)
        System.out.println(time1 - time);
    }
}
