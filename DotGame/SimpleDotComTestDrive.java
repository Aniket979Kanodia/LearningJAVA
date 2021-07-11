package com.company;


public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        int numberOfGuess =0;
        SimpleDotCom dot = new SimpleDotCom();
        GameHelper helper = new GameHelper();

        int randomNumber =(int)(Math.random() * 5);
        int[] locations = {randomNumber,randomNumber+1,randomNumber+2};
        dot.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput( "Enter a number : ");
            String result = dot.checkYourself(guess);
            numberOfGuess++;
            if(result.equals("kill")){
                isAlive =false;
                System.out.println("You took " + numberOfGuess + " guesses");
            }
        }

    }
}
