package com.company;

public class ArrayPractice03 {
    public static int indexOfZero(int[] A){
        int maxCount = 0;
        int maxIndex = -1;
        int previousIndex = -1;
        int count=0;

        for(int i=0;i<A.length;i++){
            if(A[i] ==1){
                count++;
            }
            else{
                count = i-previousIndex;
                previousIndex=i;

            }

            if(count>maxCount){
                maxCount=count;
                maxIndex=previousIndex;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };

        int index = indexOfZero(A);

        if(index != -1){
            System.out.println("Index to be replaced is: " + index);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
