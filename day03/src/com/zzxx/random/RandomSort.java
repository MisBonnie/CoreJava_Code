package com.zzxx.random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 随机排序
 */
public class RandomSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(RandomSort.class.getResourceAsStream("name.txt")));
        String str ;
        List<String> names = new ArrayList<>();
        while((str=br.readLine())!=null){
            names.add(str);
        }
        Collections.shuffle(names);
        names.stream().forEach((name) -> System.out.println(name));
    }
}
