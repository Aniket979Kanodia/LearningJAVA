package com.company;
import java.util.*;

public class circle {
    public void calculate(){
        Scanner sin = new Scanner(System.in);
        float radius;
        System.out.println("Enter radius of circle :");
        radius = sin.nextFloat();

        float area , circumference;

        area = radius*radius*3.14F;

        circumference = 2*radius*3.14F;

        System.out.println("Area of circle is : " + area);
        System.out.println("Circumference of circle is : " + circumference);
        System.out.println();
        System.out.println();

    }

}