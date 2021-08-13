//Problem: https://www.techiedelight.com/find-maximum-length-sub-array-having-given-sum/
package com.company;

public class ArrayPractice01 {
    static int max(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int  sum =8;
        int maxl =0;
        for(int i=0;i< arr.length;i++){
            int sumt=arr[i];
            if(sumt==sum){
                maxl=1;
            }
            for(int j=i+1;j<arr.length;j++){

                sumt+=arr[j];
                if(sumt==sum){
                    maxl = max(maxl,j-i+1);
                }
                if(sumt>sum){
                    break;
                }
            }
        }
        System.out.println(maxl);

    }
}
