package com.company;

public class problem03 {
    public static void main(String[] args) {
        LinkedList.Node lastNode;
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
        lastNode=list.head;

        while (lastNode.next!=null){
            lastNode=lastNode.next;
        }
        LinkedList.Node currentNode= list.head, prevNode;
        while (currentNode!=null){

            if(currentNode.data%2==0){

              list.insertAfter(lastNode, currentNode.data);
                list.deleteByKey(currentNode.data);
            }
            currentNode=currentNode.next;
        }
        list.printList();

    }
}
