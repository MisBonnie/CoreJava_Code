package com.zzxx.tree;

public class DemoTree {
    public static void main(String[] args) {
        SortedTree tree = new SortedTree();
        tree.add(53);
        tree.add(23);
        tree.add(10);
        tree.add(45);

        tree.travel();
    }
}
