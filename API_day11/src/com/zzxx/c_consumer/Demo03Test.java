package com.zzxx.c_consumer;

import java.util.function.Consumer;

public class Demo03Test {
    /**
     * 请按照格式“ 姓名:XX。性别:XX。 ”的格式将信息打印出 来
     * str: "迪丽热巴,女"
     * 第一次消费: 姓名:迪丽热巴.
     * 第二次消费: 性别:女.
     */
    public static void transfer(String str, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(str);
    }
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "⻢尔扎哈,男" };
        for (String str : array) {
            transfer(str, s -> { // 姓名:迪丽热巴.
                String name = s.split(",")[0];
                System.out.print("姓名: " + name + ". ");
            }, s->{
                String sex = s.split(",")[1];
                System.out.println("性别: " + sex + ". ");
            });
        }
    }
}
