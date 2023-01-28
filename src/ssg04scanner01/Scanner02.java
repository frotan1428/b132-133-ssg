package ssg04scanner01;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {



        // write a program that calculates the volume of a rectangular  with length, width, height

        // Hint: the volume of the rectangle= width*height*length;

       // Scanner input = new Scanner(System.in);

//        System.out.println("Enter Your length");
//        double length=input.nextDouble();
//
//        System.out.println("Enter Your width");
//        double width=input.nextDouble();
//
//        System.out.println("Enter Your height");
//        double height=input.nextDouble();
//
//        System.out.println("the volume of the rectangular is: " + width*length*height);



        Scanner input = new Scanner(System.in);
        System.out.println("Enter length, width,height...");
        double length = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();

        System.out.println("Volume of a rectangular prism is: " + (width * length * height));





    }
}
