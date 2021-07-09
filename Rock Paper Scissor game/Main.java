package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);

        int player_choice , com_choice;
        System.out.println("Options");
        System.out.println("0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Scissor");
        System.out.println("Computer is making its choice.....");
        com_choice =  (int) (Math.random() *2);
        System.out.println("Computer has made its choice!!");
        System.out.println("Choose your move by entering number associated in list");
        player_choice = sin.nextInt();

        if(player_choice==com_choice){
            System.out.println("Draw");

        }
        else{
            if(com_choice == 1){
                if(player_choice == 2){
                    System.out.println("Player Won");
                }
                else{
                    System.out.println("Player Loose");
                }
            }
            else if (com_choice==2){
                if(player_choice == 1){
                    System.out.println("Player Loose");
                }
                else{
                    System.out.println("Player Won");
                }

            }
            else{
                if(player_choice == 1){
                    System.out.println("Player Won");
                }
                else{
                    System.out.println("Player Loose");
                }
            }
        }

      System.out.println("Computer chose: " + com_choice );
//        for (int i=0;i<10;i++){
//            System.out.println( (int)(Math.random())*2);
//        }
	// write your code here
    }
}
