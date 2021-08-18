package com.company;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class QueueLL {
    private static Node rear = null,front=null;

    public int dequeue(){
        if(front==null){
            System.out.println("\nQueue Underflow");
            System.exit(1);
        }

        Node temp =front;
        front =front.next;

        if(front==null){
            rear=null;
        }

        int item = temp.data;
        return item;
    }

    public void enqueue(int item){
        Node node = new Node(item);
        if(front == null){
            front = node;
            rear=node;
        }
        else{
            rear.next=node;
            rear=node;
        }
    }

    public int peek(){
        if(front!=null){
            return front.data;
        }
        else{
            System.exit(1);
        }
        return -1;
    }

    public boolean isEmpty(){
        return rear == null && front == null;
    }
}

class Main{

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println("The fornt element : " + q.peek());

        q.dequeue();

        System.out.println("New fornt element : " + q.peek());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        if (q.isEmpty()) {
            System.out.print("The queue is empty");
        }
        else {
            System.out.print("The queue is not empty");
        }


    }
}


