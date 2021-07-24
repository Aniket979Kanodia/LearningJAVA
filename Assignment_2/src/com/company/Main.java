package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sin = new Scanner(System.in);

        int choice;


        while(true) {

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

            choice = sin.nextInt();


                if(choice == 0){
                    break;
                }


                switch (choice) {

                    case 1:
//                        circle circleCal = new circle();
//                        circleCal.calculate();
                        break;

                    case 2:
//                        square squareCal = new square();
//                        squareCal.calculate();
                        break;

                    case 3:
//                        rectangle rectangleCal = new rectangle();
//                        rectangleCal.calculate();
                        break;

                    case 4:
//                        triangle triangleCal = new triangle();
//                        triangleCal.calculate();
                        break;

                    case 5:
//                        cube cubeCal = new cube();
//                        cubeCal.calculate();
                        break;

                    case 6:
//                        cuboid cuboidCal = new cuboid();
//                        cuboidCal.calculate();
                        break;

                    case 7:
//                        cone coneCal = new cone();
//                        coneCal.calculate();
                        break;

                    case 8:
//                        cylinder cylinderCal = new cylinder();
//                        cylinderCal.calculate();
                        break;
                    default:
                        System.out.println("Invalid Selection");

                }




        }

        // write your code here
    }
}