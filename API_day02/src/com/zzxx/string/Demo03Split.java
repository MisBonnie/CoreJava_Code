package com.zzxx.string;

import java.util.Arrays;

public class Demo03Split {
    public static void main(String[] args) {
        String str = "string123date14hello4word34234";
        // 需求: string  date  hello  word
        String regex = "[0-9]+";
        String[] words = str.split(regex);
        System.out.println(Arrays.toString(words));

        String ip = "192.168.3.100"; // \.

        String letters = "hello! how are you, i miss you! i'm 8 years old";
        // \W+

        // 1 + 2 = ?   \D+
    }
}
