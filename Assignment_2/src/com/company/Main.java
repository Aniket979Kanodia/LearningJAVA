package com.company;

import java.util.*;
class InvalidFigureException extends Exception{
    figureDoNotExistException(String s){
        super(s);
    }
}
public class Main {

    public static void printMenu(){
        System.out.println("Select any shape from the list :");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.println("5. Cube");
        System.out.println("6. Cuboid");
        System.out.println("7. Cone");
        System.out.println("8. Cylinder");
        System.out.println("To end the program press 0");
    }

    public static void makeChoice(int choice){
        switch (choice) {
            case 1 -> {
                Circle circleCal = new Circle();
                circleCal.calculate();
            }
            case 2 -> {
                Square squareCal = new Square();
                squareCal.calculate();
            }
            case 3 -> {
                Rectangle rectangleCal = new Rectangle();
                rectangleCal.calculate();
            }
            case 4 -> {
                Triangle triangleCal = new Triangle();
                triangleCal.calculate();
            }
            case 5 -> {
                Cube cubeCal = new Cube();
                cubeCal.calculate();
            }
            case 6 -> {
                Cuboid cuboidCal = new Cuboid();
                cuboidCal.calculate();
            }
            case 7 -> {
                Cone coneCal = new Cone();
                coneCal.calculate();
            }
            case 8 -> {
                Cylinder cylinderCal = new Cylinder();
                cylinderCal.calculate();
            }
            default -> System.out.println("Invalid Selection");
        }
    }

    public static void main(String[] args){

        Scanner sin = new Scanner(System.in);

        int choice;
        while (true)
        {
            printMenu();

            try {
                choice = sin.nextInt();

                if (choice == 0)
                {
                    break;
                }
                makeChoice(choice);

            }catch(InputMismatchException e){
                    System.out.print("Invalid Input " );
                    if(sin.hasNext()){
                        System.out.print(" : " + sin.next() + "\n");
                    }
            }
        }
        // write your code here
    }
}
