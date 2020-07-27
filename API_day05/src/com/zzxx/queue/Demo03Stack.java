package com.zzxx.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Demo03Stack {
    public static void main(String[] args) {
        // Deque当你使用它的 push 和 pop 方法时, 他就变成了栈
        // 链表栈
        Deque<String> stack = new LinkedList<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);
        String s = stack.pop();
        System.out.println("栈顶元素: " + s);
        System.out.println("栈: " + stack);

        // 栈: 数组栈
        Stack<String> stack2 = new Stack<>();
        stack2.push("h");
        stack2.push("i");
        System.out.println(stack2);

        String s2 = stack2.pop();
        System.out.println("stack2的栈顶: " + s2);
    }
}
