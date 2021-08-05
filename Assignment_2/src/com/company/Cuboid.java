package com.company;
import java.util.*;

public class Cuboid {
    Scanner sin = new Scanner(System.in);
    public void calculate(){
        double length , breadth ,height;
    try {
        System.out.println("Enter length of rectangle : ");
        length = sin.nextDouble();
        if(length<=0){
            throw new figureDoNotExistException("Exception");
        }
        System.out.println("Enter breadth of rectangle : ");
       breadth = sin.nextDouble();
        if(breadth<=0){
            throw new InvalidFigureException("Exception");
        }
        System.out.println("Enter height of rectangle : ");
        height = sin.nextDouble();
        if(height<=0){
            throw new InvalidFigureException("Exception");
        }

        double areaFace1, areaFace2, areaFace3, totalSurfaceArea, volume;
        areaFace1 = length * breadth;
        areaFace2 = height * breadth;
        areaFace3 = length * height;
        totalSurfaceArea = 2 * (areaFace1 + areaFace2 + areaFace3);
        volume = length * breadth * height;

        System.out.println("Area of faces of cuboid : ");
        System.out.println("Area of face 1 : " + areaFace1);
        System.out.println("Area of face 2 : " + areaFace2);
        System.out.println("Area of face 3 : " + areaFace3);
        System.out.println("Total Surface Area of Cuboid : " + totalSurfaceArea);
        System.out.println("Volume of cuboid : " + volume);
    }catch(InputMismatchException e){
        System.out.println("Invalid Input : " + sin.next());
    }catch(InvalidFigureException e){
        System.out.println("Value entered is invalid");
    }

    }
}
