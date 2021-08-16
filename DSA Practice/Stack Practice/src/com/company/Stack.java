package com.company;

public class Stack {

    private int arr[];
    private int top;
    private int capacity;
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top =-1;
    }
    public Boolean isFull(){
        return top ==capacity-1;
    }
    public Boolean isEmpty(){
        return top == -1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Overflow\nProgram Terminated");
            System.exit(1);
        }
        arr[++top]=x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        return arr[top--];
    }

    public int peek(){
        if(!isEmpty()){
            return arr[top];
        }
        else{
            System.exit(1);
        }
        return -1;
    }

    public int size(){
        return top+1;
    }

    public static void main(String[] args) {
        Stack stack= new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.size());
        System.out.println("Top Element= " + stack.peek());
        stack.pop();
        System.out.println(stack.size());
        System.out.println("New top element= " + stack.peek());

    }
}
