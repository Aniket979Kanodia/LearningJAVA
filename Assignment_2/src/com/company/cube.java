package com.company;
import java.util.*;


public class cube {
    Scanner sin = new Scanner(System.in);
    public void calculate(){
        double side;
        System.out.println("Enter length of side of cube : ");
        side = sin.nextDouble();
        double totalSurfaceArea , faceArea , volume;
        faceArea = side * side;
        totalSurfaceArea= faceArea*6;
        volume = faceArea*side;

        System.out.println("Area of each face of cube : " + faceArea);
        System.out.println("Total surface area of cube : " + totalSurfaceArea);
        System.out.println("Volume of cube : " + volume);

    }


}