package com.company;
import java.util.*;

public class Square {
    Scanner sin = new Scanner(System.in);


    public void calculate(){
        float side;
        try {
            System.out.println("Enter side of square : ");
            side = sin.nextFloat();
            if(side<=0){
                throw new InvalidFigureException("Exception");
            }
            float area = side * side;
            float perimeter = 4 * side;
            System.out.println("Area of the square : " + area);
            System.out.println("Perimeter of the square : " + perimeter);
            System.out.println();
            System.out.println();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input : " + sin.next());
        }catch(InvalidFigureException e){
            System.out.println("Value entered is invalid");
        }
    }
}
