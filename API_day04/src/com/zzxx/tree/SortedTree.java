package com.zzxx.tree;

public class SortedTree {

    private class Node {
        private int data;
        private Node left;
        private Node right;

        private Node(int data) {
            this.data = data;
        }
    }
    private Node root; // 根节点, 最开始为null
    // 给自己使用
    private void travelNode(Node node) {
        if (node.left != null) {
            travelNode(node.left);
        }
        System.out.println(node.data);
        if (node.right != null) {
            travelNode(node.right);
        }
    }

    // 给外部提供的方法
    public void travel() {
        travelNode(root);
    }
    private void addToNode(Node node, int data) {}

    public void add(int a) {
        // 先判断a是不是第一个元素
        if (root == null) {
            root = new Node(a);
            return;
        }
        Node node = root; // 记录每一次的当前节点
        Node parentNode; // 记录每一次node的父节点
        // 不是第一个元素
        while(true) {
            parentNode = node;
            if (node.data > a) {
                // a向左边节点继续比较
                node = node.left;
                if (node == null) {
                    parentNode.left = new Node(a);
                    return;
                }
            } else if (node.data < a) {
                // a向右边节点继续比较
                node = node.right;
                if (node == null) {
                    parentNode.right = new Node(a);
                    return;
                }
            }
        }

    }
}
