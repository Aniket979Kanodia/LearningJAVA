package com.company;
import java.util.*;
import java.math.*;

public class cone {
    Scanner sin = new Scanner(System.in);
    public void calculate(){
        double radius , height , slantHeight;
        System.out.println("Enter radius of cone : ");
        radius = sin.nextDouble();
        System.out.println("Enter height of cone : ");
        height = sin.nextDouble();
        slantHeight = Math.sqrt((height*height) + (radius*radius));
        double baseArea = 3.14*radius*radius;
        double volume = (3.14*radius*radius*height)/3;
        double surfaceArea = (3.14*radius*slantHeight);

        System.out.println("Slant height of cone : " + slantHeight);
        System.out.println("Base area of cone : " + baseArea);
        System.out.println("Surface area of cone : " + surfaceArea);
        System.out.println("Volume of cone : " + volume);

    }


}