package com.zzxx.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo05CharExercise {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        // 1.将字符串转换成字符数组
        char[] chars = str.toCharArray();
        // 2.遍历数组, 进行统计
        for (char c : chars) {
            // 判断c是不是第一次出现
            Integer ori = map.get(c);
            if (ori == null) {
                ori = 0;
            }
            map.put(c, ori + 1);
        }
        System.out.println(map);
    }
}
