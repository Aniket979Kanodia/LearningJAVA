//Problem: https://www.techiedelight.com/sorted-insert-in-linked-list/

package com.company;

public class problem01 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);

        LinkedList.Node CurrNode = list.head;
        while(CurrNode.data<5){
            CurrNode =CurrNode.next;
        }
        list.insertAfter(CurrNode,5);
        list.printList();
    }
}
