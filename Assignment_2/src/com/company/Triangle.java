package com.company;
import java.util.*;

public class Triangle {
    Scanner sin = new Scanner(System.in);


    public void calculate(){
        double side1,side2,side3;
        try {

            System.out.println("Enter length of first side of triangle : ");
            side1 = sin.nextDouble();
            if(side1<=0){
                throw new InvalidFigureException("Exception");
            }

            System.out.println("Enter length of second side of triangle : ");
            side2 = sin.nextDouble();
            if(side2<=0){
                throw new InvalidFigureException("Exception");
            }

            System.out.println("Enter length of third side of triangle : ");
            side3 = sin.nextDouble();
            if(side3<=0){
                throw new InvalidFigureException("Exception");
            }

            double semiPrimeter = (side1 + side2 + side3) / 2;
            double perimeter = semiPrimeter * 2;
            double areaSquare = (semiPrimeter) * (semiPrimeter - side1) * (semiPrimeter - side2) * (semiPrimeter - side3);
            if(areaSquare<=0){
                throw new InvalidFigureException("Exception");
            }else {
                double area = Math.sqrt(areaSquare);
                System.out.println("Perimeter of triangle : " + perimeter);
                System.out.println();
                System.out.println("Area of triangle : " + area);
            }
        }catch(InvalidFigureException e){
            System.out.println("Invalid Input : " + sin.next());
        }catch(figureDoNotExistException e){
            System.out.println("Value entered is invalid");
        }
    }
}
