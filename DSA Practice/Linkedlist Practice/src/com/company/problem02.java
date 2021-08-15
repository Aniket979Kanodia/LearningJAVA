package com.company;

public class problem02 {
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

        LinkedList start = new LinkedList();
        LinkedList end = new LinkedList();
        LinkedList.Node currentNode = list.head;
        int length=0;
        while (currentNode!=null){
            length++;
            currentNode=currentNode.next;
        }
        currentNode=list.head;

        System.out.println(length);
        int halfLength;
        if(length%2==1){
            halfLength=(length/2)+1;
        }
        else{
            halfLength= length/2;
        }
        for(int i=0;i<halfLength;i++){
         start.insert(currentNode.data);
         currentNode=currentNode.next;
        }
        for(int i=halfLength;i<length;i++){
            end.insert(currentNode.data);
            currentNode=currentNode.next;
        }
        start.printList();
        System.out.println();
        end.printList();

    }
}
