package com.zzxx.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo01Arrays {
    public static void main(String[] args) {
        String[] ss = {"张三丰", "张无忌", "谢逊"};
        // 将数组转换为 List 有序列表
        List<String> list = Arrays.asList(ss);
        System.out.println(list);

        // list真正的类型是Arrays的内部类,不是我们真正的ArrayList
        // 不能使用增\删的相关方法
        /*list.add("赵敏");*/
        /*System.out.println(list);*/

        // 让list 变成一个真正的ArrayList
        List<String> list1 = new ArrayList<>(list);
        list1.add("赵敏");
        System.out.println(list1);
    }
}
