package ssg07ifstatementandternary;

import java.util.Objects;
import java.util.Scanner;

public class IfStatements02 {



    public static void main(String[] args) {

        // Question 1) Ask the user for an integer // and print whether the number is odd or even

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter an Integer number");
        int num= scan.nextInt();

        /*
        if(num%2==0)
            System.out.println("number is even");

        if(num%2!=0)
            System.out.println("number is odd");

        if(num%2==0){
            System.out.println("number is Even");
        }else {
            System.out.println("number is odd");
        }


        System.out.println(num%2==0 ? "number is Even" : "number is odd");
            String str =num%2==0 ? "number is Even" : "number is odd";
        System.out.println(str);

         */
        int squareandcube  =num%2==0 ? num*num : num*num*num;
        System.out.println(squareandcube);

        if(num%2==0){
            System.out.println("number is Even");
        }else {
            System.out.println("number is odd");
        }


        System.out.println(num%2==0 ? "number is Even" : "number is odd");



    }
}
