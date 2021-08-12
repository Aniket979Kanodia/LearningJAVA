package com.company;

public class minmaxDAC {
    static class minmax{
        int min;
        int max;
    }
    static minmax getminmax(int arr[] , int start , int end){
        minmax pair = new minmax();
        if(start==end){
            pair.max= arr[start];
            pair.min= arr[end];
            return pair;
        }
        if(start==end-1){
            if(arr[start]>=arr[end]){
                pair.max= arr[start];
                pair.min= arr[end];
            }
            else{
                pair.max= arr[end];
                pair.min= arr[start];
            }
        }
        int mid =(start+end)/2;

        minmax pleft = new minmax();
        pleft = getminmax(arr,start,mid);
        minmax pright = new minmax();
        pright = getminmax(arr,mid+1,end);
        if(pleft.min<= pright.min){
            pair.min = pleft.min;
        }else{
            pair.min = pright.min;
        }

        if(pleft.max>= pright.max){
            pair.max = pleft.max;
        }else{
            pair.max = pright.max;
        }

        return pair;

    }

    public static void main(String[] args) {
        int a[] = {2,5,6,7,3,6};
        minmax Result = new minmax();
        Result= getminmax(a,0,a.length-1);
        System.out.println(Result.max);
        System.out.println(Result.min);

    }


}