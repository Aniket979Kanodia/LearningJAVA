package com.company;

public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size){
        arr = new int[size];
        capacity = size;
        front =0;
        rear =-1;
        count=0;
    }
    public int size(){
        return count;
    }
    public Boolean isFull(){
        return (size() == capacity);
    }
    public Boolean isEmpty(){
        return(size()==0);
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("Overflow\nProgram Terminated");
            System.exit(1);
        }
        rear =(rear+1)%capacity;
        arr[rear] = item;
        count++;
    }

    public void deque(){
        if(isEmpty()){
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        front = (front+1)%capacity;
        count--;

    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
    }

    public void printQueue(){
        while(!isEmpty()){
            System.out.print(peek() + " ");
            deque();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.peek());
        q.deque();
        System.out.println(q.peek());
        System.out.println(q.size());

    }
}
