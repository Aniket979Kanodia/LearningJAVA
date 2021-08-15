package com.company;
import java.math.*;
public class problem05 {
    public static void merge(LinkedList first, LinkedList second){
        LinkedList.Node currentFirst = first.head;
        LinkedList.Node currentSecond = second.head;
        while (currentSecond!=null){
            first.insertAfter(currentFirst, currentSecond.data);
            currentFirst=currentFirst.next.next;
            currentSecond=currentSecond.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);
        LinkedList list2= new LinkedList();
        list2.insert(6);
        list2.insert(7);
        list2.insert(8);
        if(list1.length()> list2.length()){
            merge(list1,list2);

        }
        else{
            merge(list2,list1);
        }
        list1.printList();
   


    }

}
