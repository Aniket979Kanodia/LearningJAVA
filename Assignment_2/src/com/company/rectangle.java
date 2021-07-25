package com.company;
import java.util.*;

public class rectangle {
    public void calculate(){
        Scanner sin = new Scanner(System.in);
        float length , width , area , perimeter;
        try {

            System.out.println("Enter length of rectangle :");
            length = sin.nextFloat();
            System.out.println("Enter width of rectangle :");
            width = sin.nextFloat();

            area = length * width;
            perimeter = 2 * (length + width);

            System.out.println("Area of Rectangle : " + area);
            System.out.println("Perimeter of Rectangle : " + perimeter);
            System.out.println();
            System.out.println();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input : " + sin.next());
        }
    }
}