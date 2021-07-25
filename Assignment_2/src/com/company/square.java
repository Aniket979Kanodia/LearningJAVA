package com.company;
import java.util.*;

public class square {
    Scanner sin = new Scanner(System.in);


    public void calculate(){
        float side;
        try {
            System.out.println("Enter side of square : ");
            side = sin.nextFloat();
            float area = side * side;
            float perimeter = 4 * side;
            System.out.println("Area of the square : " + area);
            System.out.println("Perimeter of the square : " + perimeter);
            System.out.println();
            System.out.println();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input : " + sin.next());
        }
    }
}
