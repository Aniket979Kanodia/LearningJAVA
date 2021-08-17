package com.company;

public class problem03 {
    public static void printSeries(String s){
        Stack stack = new Stack(s.length()+1);
        int max = s.length()+1;
        int min = 1;
        for(char c: s.toCharArray()){
            if(c=='I'){
                stack.push(min++);
            }
            else{
                stack.push(max--);
            }
        }
    }
    public static void main(String[] args) {
        String s1 = "IIDDIDID";//1298
        String s2 = "IDIDII";
        String s3 = "DDDD";
        String s4 = "IIII";


    }
}
