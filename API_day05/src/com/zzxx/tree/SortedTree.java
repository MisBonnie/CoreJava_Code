package com.zzxx.tree;

public class SortedTree<T> {
    private class Node<T> {
        private T data;
        private Node left;
        private Node right;
        public Node(T data) {
            this.data = data;
        }
    }
    private Node<T> root; // 二叉树中的根节点

    private void addToNode(Node node, T t) {
        // 1.比较 node.data 和 t的大小
        if (((Comparable) t).compareTo(node.data) < 0) {
            // 加到node的左边
            if (node.left == null) {
                node.left = new Node<T>(t);
                return;
            }
            addToNode(node.left, t);
        } else if (((Comparable) t).compareTo(node.data) > 0) {
            // 加到node的右边
            if (node.right == null) {
                node.right = new Node<T>(t);
                return;
            }
            addToNode(node.right, t);
        }
    }
    public void add(T t) {
        // 1.判断根节点是否为空 -> 其实就是判断二叉树是否为空
        if (root == null) {
            root = new Node<T>(t);
            return;
        }
        addToNode(root, t);
    }
    private void travelNode(Node node) {
        if (node.left != null) {
            travelNode(node.left);
        }
        System.out.println(node.data);
        if (node.right != null) {
            travelNode(node.right);
        }
    }
    public void travel() {
        travelNode(root);
    }
    /*public void add(T t) {
        // 1.判断根节点是否为空 -> 其实就是判断二叉树是否为空
        if (root == null) {
            root = new Node<T>(t);
            return;
        }
        Node node = root;
        Node parentNode ;
        // 2.判断 t 和 根节点.data 大小关系
        while (true) {
            parentNode = node;
            if (((Comparable) t).compareTo(node.data) < 0) {
                // 将t加入到node的左边
                node = node.left;
                if (node == null) {
                    parentNode.left = new Node<T>(t);
                }
            } else if (((Comparable) t).compareTo(node.data) > 0) {
                // 将t加入到node的右边
                node = node.right;
                if (node == null) {
                    parentNode.right = new Node<T>(t);
                }
            }
        }
    }*/
}
