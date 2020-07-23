package com.zzxx.dataStructure;

public class DemoSingleLinked {
    public static void main(String[] args) {
        SingleLinked<Integer> linked = new SingleLinked();
        linked.add(3);
        linked.add(5);
        linked.add(2);

        linked.insert(1, 8);

        System.out.println(linked);

        System.out.println(linked.get(3));
        linked.remove(2);
        System.out.println(linked);
    }
}
