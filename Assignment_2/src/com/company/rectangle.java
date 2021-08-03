package com.company;
import java.util.*;

public class rectangle {
    public void calculate(){
        Scanner sin = new Scanner(System.in);
        float length , width , area , perimeter;
        boolean check =true;
        while(check) {
            try {

                System.out.println("Enter length of rectangle :");
                length = sin.nextFloat();
                if (length <= 0) {
                    throw new figureDoNotExistException("Exception");
                }
                System.out.println("Enter width of rectangle :");
                width = sin.nextFloat();
                if (width <= 0) {
                    throw new figureDoNotExistException("Exception");
                }

                area = length * width;
                perimeter = 2 * (length + width);

                System.out.println("Area of Rectangle : " + area);
                System.out.println("Perimeter of Rectangle : " + perimeter);
                System.out.println();
                System.out.println();
                check =false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input : " + sin.next());
            } catch (figureDoNotExistException e) {
                System.out.println("Value entered is invalid");
            }
        }
    }
}