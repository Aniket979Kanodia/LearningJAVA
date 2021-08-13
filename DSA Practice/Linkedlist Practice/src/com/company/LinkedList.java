package com.company;

public class LinkedList {

    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next = null;
        }
    }

    public void insert(int data){
        Node new_node = new Node(data);
        new_node.next = null;

        if(head==null){
            head = new_node;
        }
        else{
            Node last= head;
            while(last.next!=null){
                last= last.next;
            }
            last.next= new_node;
        }
        return;
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prevNode, int data){
        if(prevNode==null){
            System.out.println("previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next=prevNode.next;
        prevNode.next=newNode;
    }

    public void printList(){
        Node CurrNode = head;

        System.out.println("LinkedList: ");
        while(CurrNode != null){
            System.out.print(CurrNode.data + " ");
            CurrNode =CurrNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);
        list.insertAfter(list.head.next,111 );

        list.printList();
    }

}
