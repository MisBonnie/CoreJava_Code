package com.zzxx.dataStructure;
// 单向链表
public class SingleLinked<T> {
    // 结点类型
    private class Node {
        private T data; // 用于存储数据
        private Node next; // 用于存下一个结点的地址
        public Node(T data) {
            this.data = data;
        }
    }
    // 最开始初始化链表时, head不存储数据, next是null
    private Node head = new Node(null);
    // 添加新的结点
    public void add(T a) {
        // 寻找next=null 的结点
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        // node.next == null
        node.next = new Node(a);
    }
    // 得到index-1位置上的元素
    private Node getIndexPreNode(int index) {
        Node node = head;
        // 要找到index-1这个位置的Node
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    // 在index位置上插入元素
    public void insert(int index, T a) {
        Node node = getIndexPreNode(index);
        Node node3 = new Node(a);
        node3.next = node.next;
        node.next = node3;
    }
    // 获得index位置上的元素
    public T get(int index) {
        Node node = getIndexPreNode(index);
        return node.next.data;
    }

    // 删除index位置上的元素
    public void remove(int index) {
        Node node = getIndexPreNode(index);
        node.next = node.next.next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node node = head;
        while (node.next != null) {
            node = node.next;
            sb.append(node.data);
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
