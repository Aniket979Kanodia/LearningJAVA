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

    public void deleteByKey(int key){
        Node currentNode = head,prev = null;
        if(currentNode!=null && currentNode.data==key){
            head = currentNode.next;

            System.out.println(key + " found and deleted");
            return;
        }
        while(currentNode!=null && currentNode.data!=key){
            prev = currentNode;
            currentNode =currentNode.next;

        }
        if(currentNode!=null){
            prev.next=currentNode.next;
            System.out.println(key + " found and deleted");
        }
        if(currentNode==null){
            System.out.println(key +" not found");
        }
        return;
    }
    public void deleteAtposition(int index){
        Node currentNode = head,prev=null;
        if(index==0&& currentNode!=null){
            head=currentNode.next;
            System.out.println("Element at position "+ index+" is deleted");
        }
        int count =0;
        while(currentNode!=null){
            if(count==index){
                prev.next=currentNode.next;
                System.out.println("Element at position "+ index+" is deleted");
            break;

            }
            else{
                prev = currentNode;
                currentNode=currentNode.next;
                count++;
            }
        }
        if(currentNode==null){
            System.out.println("No element was found at position " + index);
        }
        return;
    }

    public int search(int element){
        if(head==null){
            return -1;
        }
        int index=0;
        Node newNode = head;
        while(newNode!=null){
            if(newNode.data == element){
                return index;
            }

            index++;
            newNode=newNode.next;
        }

        return -1;
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
        list.deleteByKey(1);
        list.deleteAtposition(7);
        int elementPosition = list.search(3);
        if(elementPosition==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position: "+elementPosition);
        }

        list.printList();
    }

}
