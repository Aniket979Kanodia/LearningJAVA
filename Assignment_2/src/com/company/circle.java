package com.company;
import java.util.*;

public class circle {
    public void calculate(){
        Scanner sin = new Scanner(System.in);
        float radius;
        boolean choice = true;
        while(choice) {
            try {
                System.out.println("Enter radius of circle :");
                radius = sin.nextFloat();
                if (radius <= 0) {
                    throw new figureDoNotExistException("Exception");
                }


                float area, circumference;

                area = radius * radius * 3.14F;

                circumference = 2 * radius * 3.14F;

                System.out.println("Area of circle is : " + area);
                System.out.println("Circumference of circle is : " + circumference);
                System.out.println();
                System.out.println();
                choice = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input : " + sin.next());
            } catch (figureDoNotExistException e) {
                System.out.println("Value entered is invalid");
            }
        }
    }

}