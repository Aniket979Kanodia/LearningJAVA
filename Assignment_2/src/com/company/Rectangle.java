package com.company;
import java.util.*;

public class Rectangle {
    public void calculate(){
        Scanner sin = new Scanner(System.in);
        float length , width , area , perimeter;
        try {

            System.out.println("Enter length of rectangle :");
            length = sin.nextFloat();
            if(length<=0){
                throw new InvalidFigureException("Exception");
            }
            System.out.println("Enter width of rectangle :");
            width = sin.nextFloat();
            if(width<=0){
                throw new InvalidFigureException("Exception");
            }

            area = length * width;
            perimeter = 2 * (length + width);

            System.out.println("Area of Rectangle : " + area);
            System.out.println("Perimeter of Rectangle : " + perimeter);
            System.out.println();
            System.out.println();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input : " + sin.next());
        }catch(InvalidFigureException e){
            System.out.println("Value entered is invalid");
        }
    }
}