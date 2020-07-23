package com.zzxx.dataStructure;

import java.util.Arrays;
// 栈
public class Stack<T> {
    private Object[] data; // 定义一个用于存数据的仓库
    private int size; // 表示栈中的元素个数

    public Stack(int cap) { // cap: 表示栈的最大容量
        data = new Object[cap];
    }
    // 压栈
    public void push(T a) {
        data[size++] = a;
    }
    // 弹栈 -> 从栈顶开始
    public T pop() {
        T a = (T) data[size-1];
        size --;
        return a; // return data[--size]
    }
    // 获取元素个数
    public int size() {
        return size;
    }

    // 判断栈是否满
    public boolean isFull() {
        return size == data.length;
    }
    // 判断栈是否为空
    public boolean isEmpty() {
        return size == 0;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            sb.append(",");
        }
        if (size != 0) {
            // 去掉最后一个逗号
            sb.delete(sb.length() - 1, sb.length());
        }
        sb.append("]");
        return sb.toString();
    }
}
