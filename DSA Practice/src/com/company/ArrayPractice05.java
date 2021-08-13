package com.company;

public class ArrayPractice05 {
    public static void reOrder(int arr[]){
        int index=0;
        for(int i:arr){
            if(i!=0){
                arr[index++]=i;
            }
        }
        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
      int arr[] =  { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
        reOrder(arr);
      for(int i:arr){
          System.out.print(i+" ");
      }
    }
}
