package com.company;

class chNode {
    char data;
    chNode next;
}

class chStackLL {
    private chNode top;

    public chStackLL() {
        this.top = null;
    }

    public void push(char x) {
        chNode node = new chNode();
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

    public char peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("The stack is empty");
            return '0';
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("\nStack Underflow");
            return;
        }
        top = top.next;
    }

}

public class problem01 {
    public static int balanceCheck(String s) {
        chStackLL stack = new chStackLL();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return 0;
                }
            } else if (c == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return 0;
                }
            } else if (c == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return 0;
                }
            }
        }
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String s1 = new String();
        s1 = "{[{}{}]}[()]";
        String s2 = new String();
        s2 = "{()}[)";

        int ans1 = balanceCheck(s1);
        int ans2 = balanceCheck(s2);

        if (ans1 == 0) {
            System.out.println("String " + s1 + " is not balanced");
        } else {
            System.out.println("String " + s1 + " is balanced");
        }
        if (ans2 == 0) {
            System.out.println("String " + s2 + " is not balanced");
        } else {
            System.out.println("String " + s2 + " is balanced");
        }


    }
}


