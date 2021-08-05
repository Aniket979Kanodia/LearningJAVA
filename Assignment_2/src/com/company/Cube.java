package com.company;
import java.util.*;


public class Cube {
    Scanner sin = new Scanner(System.in);
    public void calculate(){
        try {
            double side;
            System.out.println("Enter length of side of cube : ");
            side = sin.nextDouble();
            if(side<=0){
                throw new InvalidFigureException("Exception");
            }
            double totalSurfaceArea, faceArea, volume;
            faceArea = side * side;
            totalSurfaceArea = faceArea * 6;
            volume = faceArea * side;

            System.out.println("Area of each face of cube : " + faceArea);
            System.out.println("Total surface area of cube : " + totalSurfaceArea);
            System.out.println("Volume of cube : " + volume);
        }catch(InputMismatchException e){
            System.out.println("Invalid Input : " + sin.next());
        }catch(InvalidFigureException e){
            System.out.println("Value entered is invalid");
        }

    }


}