package com.company;
import java.util.*;

public class triangle {
    Scanner sin = new Scanner(System.in);


    public void calculate(){
        double side1,side2,side3;

        System.out.println("Enter length of first side of triangle : ");
        side1 = sin.nextDouble();

        System.out.println("Enter length of second side of triangle : ");
        side2 = sin.nextDouble();

        System.out.println("Enter length of third side of triangle : ");
        side3 = sin.nextDouble();

        double semiPrimeter =  (side1 + side2 + side3) /2;
        double perimeter = semiPrimeter*2;
        double areaSquare = (semiPrimeter)*(semiPrimeter-side1)*(semiPrimeter-side2)*(semiPrimeter-side3);
        if(areaSquare<=0){
            System.out.println("Invalid dimension for square");
        }
        else{
            double area = Math.sqrt(areaSquare);
            System.out.println("Perimeter of triangle : " + perimeter);
            System.out.println();
            System.out.println("Area of triangle : " + area);
        }
    }
}
