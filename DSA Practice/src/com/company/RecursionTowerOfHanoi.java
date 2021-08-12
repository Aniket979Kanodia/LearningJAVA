package com.company;
import java.util.*;


public class RecursionTowerOfHanoi {


    static void towersOfHanoi(int n,char fromPeg,char toPeg,char auxPeg){
        if(n==1){
            System.out.println("Move disk 1 from peg " + fromPeg + " to peg " +toPeg );
            return;
        }
        towersOfHanoi(n-1,fromPeg,auxPeg,toPeg);
        System.out.println("Move disk " + n + " from peg " + fromPeg + " to peg " + toPeg );
        towersOfHanoi(n-1,auxPeg,toPeg,fromPeg);
    }

    public static void main(String[] args){
        Scanner sin = new Scanner(System.in);
        int numberOfDisk;
        char a,t,f;
        numberOfDisk = sin.nextInt();
        a= sin.next().charAt(0);
        t= sin.next().charAt(0);
        f= sin.next().charAt(0);
        towersOfHanoi(numberOfDisk,f,a,t);


    }
}
