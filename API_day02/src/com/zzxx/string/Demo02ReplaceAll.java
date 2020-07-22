package com.zzxx.string;

public class Demo02ReplaceAll {
    public static void main(String[] args) {
        // (sb|nc|qnm|qnmlgb|nmb)+
        String regex = "(sb|nc|qnm|qnmlgb|nmb)+";
        String word = "你怎么回事, 真是个sb, 你这个nc, qnm, 会不会玩!";
        word = word.replaceAll(regex, "**");
        System.out.println(word);
    }
}
