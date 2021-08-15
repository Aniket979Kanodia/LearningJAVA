package com.company;

public class probllem04 {
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
        LinkedList first = new LinkedList();
        LinkedList second = new LinkedList();
        LinkedList.Node CurrentNode = list.head;
        int count=0;
        while (CurrentNode!=null){
            if(count%2==0){
                first.insert(CurrentNode.data);
            }
            else{
                second.insert(CurrentNode.data);
            }
            count++;
            CurrentNode=CurrentNode.next;

        }
        first.printList();
        System.out.println();
        second.printList();
    }
}
