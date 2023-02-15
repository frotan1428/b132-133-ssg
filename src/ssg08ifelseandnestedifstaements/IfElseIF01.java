package ssg08ifelseandnestedifstaements;

import java.util.Scanner;

public class IfElseIF01 {

    public static void main(String[] args) {

        // Question 2) Ask the user for a grade system  of   100.
        // check the grade system .
        // "D" if less than 50,
        // =50 <60 "C",
        // =60 <80 between "B",
        // "A" if greater than 80;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Grade");

        byte grade = input.nextByte();

        if (grade<0|| grade>=100) {
            System.out.println("Please Enter  a valid point ");
        } else if (grade<51) {
            System.out.println("D");
        } else if (grade<60) {
            System.out.println("C");
        } else if (grade<80) {
            System.out.println("B");
        }else {
            System.out.println("A");
        }


        System.out.println("------------");
        if (grade>80) {
            System.out.println("A");
        } else if (grade<51) {
            System.out.println("D");
        } else if (grade<60) {
            System.out.println("C");
        } else if (grade<80) {
            System.out.println("B");
        }else if (grade<0|| grade>=100) {
            System.out.println("Please Enter  a valid point ");
        }




    }
}
