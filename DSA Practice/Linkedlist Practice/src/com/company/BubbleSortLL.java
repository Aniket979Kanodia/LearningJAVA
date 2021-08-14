package com.company;

public class BubbleSortLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(36);
        list.insert(84);
        list.insert(5);
        list.insert(56);
        list.insert(17);
        list.insert(18);
        list.insert(9);
        list.bubbleSort();
        list.printList();

    }
}
