//Problem: techiedelight.com/inplace-merge-two-sorted-arrays/
package com.company;

public class ArrayPractice02 {
    static int min(int a,int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        int X[] = { 1, 4, 7, 8, 10 };
        int Y[] = { 2, 3, 9 };
        int length = min(X.length,Y.length);
        for(int i=0;i<X.length;i++){
            if(X[i]>Y[0]){
                int temp1 = Y[0];
                Y[0]=X[i];
                X[i]= temp1;
                int j=1;
                for(;j<Y.length;j++){
                    if(Y[j]<Y[j-1]){
                        int tem2 = Y[j];
                        Y[j]=Y[j-1];
                        Y[j-1]=tem2;
                    }
                    else{
                        break;
                    }
                }
            }
            for(int d:X){
                System.out.print(d+ " ");
            }
            System.out.println();
            for(int d:Y){
                System.out.print(d + " ");
            }
            System.out.println();
        }
        for(int d:X){
            System.out.println(d);
        }
        for(int d:Y){
            System.out.println(d);
        }
    }
}