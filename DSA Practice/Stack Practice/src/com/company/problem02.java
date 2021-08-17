package com.company;

public class problem02 {
    public static boolean dublicateParanthesis(String s){
        chStackLL stack = new chStackLL();
        for(char c:s.toCharArray()){
            if(c!=')'){
                stack.push(c);
            }
            else{
                if(stack.peek()=='('){
                    return true;

                }

                while(stack.peek()!='('){
                    stack.pop();
                }
                stack.pop();

            }


        }
        return false;
    }

    public static void main(String[] args) {
        String s = new String();
        s="((x+y)+x)";
        boolean b =dublicateParanthesis(s);
        if(b){
            System.out.println("Duplicate parenthesis exist");
        }
        else{
            System.out.println("No duplicate parenthesis");
        }
    }

}
