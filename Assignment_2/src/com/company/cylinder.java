package com.company;
import java.util.*;


public class cylinder {
    Scanner sin = new Scanner(System.in);
    public void calculate(){
        double radius , height;
        try {
            System.out.println("Enter radius of cylinder : ");

            radius = sin.nextDouble();
            if(radius<=0){
                throw new figureDoNotExistException("Exception");
            }
            System.out.println("Enter height of cylinder : ");
            height = sin.nextDouble();
            if(height<=0){
                throw new figureDoNotExistException("Exception");
            }

            double baseArea = 3.14 * radius * radius;
            double curvedSurfaceArea = 2 * 3.14 * radius * height;
            double volume = baseArea * height;

            System.out.println("Base area of cylinder : " + baseArea);
            System.out.println("Curved surface area of cylinder : " + curvedSurfaceArea);
            System.out.println("Volume of cylinder : " + volume);
        }catch(InputMismatchException e){
            System.out.println("Invalid Input : " + sin.next());
        }catch(figureDoNotExistException e){
            System.out.println("Value entered is invalid");
        }

    }
}