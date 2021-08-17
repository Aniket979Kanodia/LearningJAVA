package com.company;

public class problem04 {
    public static StringBuilder minNum(String s){
        Stack stack = new Stack(s.length()+1);
        StringBuilder result = new StringBuilder();
        for(int i=0;i<=s.length();i++){
            stack.push(i+1);
           if(i==s.length()||s.toCharArray()[i]=='I'){
               while(!stack.isEmpty()){
                   result.append(stack.pop());
               }
           }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "IDIDII";
        System.out.println(minNum(s));
    }
}
