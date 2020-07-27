package com.zzxx.tree;

public class Demo01Tree {
    public static void main(String[] args) {
        SortedTree<String> tree = new SortedTree<>();
        tree.add("tom");
        tree.add("hi");
        tree.add("hehe");
        tree.add("lucy");
        tree.add("jack");

        tree.travel();
    }
}
