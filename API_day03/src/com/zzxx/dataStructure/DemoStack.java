package com.zzxx.dataStructure;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack(8);
        while (!stack.isFull()) {
            stack.push(3);
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            int a = stack.pop();

            System.out.println(a);
        }
        System.out.println(stack);



    }
}
