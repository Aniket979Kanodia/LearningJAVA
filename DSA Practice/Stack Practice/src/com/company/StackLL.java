package com.company;

class Node {
    int data;
    Node next;
}

class StackLL {
    private Node top;

    public StackLL() {
        this.top = null;
    }

    public void push(int x) {
        Node node = new Node();
        if (node == null) {
            System.out.println("\nHeap Overflow");
            return;
        }
        node.data = x;
        node.next = top;
        top = node;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("The stack is empty");
            return -1;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("\nStack Underflow");
            return;
        }
        top = top.next;
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());


    }
}
