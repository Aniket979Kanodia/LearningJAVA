package com.company;
import java.util.*;

public class square {
    Scanner sin = new Scanner(System.in);


    public void calculate(){
        float side;
        boolean check = true;
        while(check) {

            try {
                System.out.println("Enter side of square : ");
                side = sin.nextFloat();
                if (side <= 0) {
                    throw new figureDoNotExistException("Exception");
                }
                float area = side * side;
                float perimeter = 4 * side;
                System.out.println("Area of the square : " + area);
                System.out.println("Perimeter of the square : " + perimeter);
                System.out.println();
                System.out.println();
                check = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input : " + sin.next());
            } catch (figureDoNotExistException e) {
                System.out.println("Value entered is invalid");
            }
        }
    }
}
