package ssg08ifelseandnestedifstaements;

import java.util.Scanner;

public class IfElse02 {

    public static void main(String[] args) {

        // Let's find out if an input character is a letter or not
        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter a Charterer ");

        //char character=scan.next().toUpperCase().charAt(0);
        char character=scan.next().charAt(0);
        System.out.println(character);

       Boolean UpperCase =character >='A'  && character<='Z';
       Boolean LowerCase =character >='a'  && character<='z';

        if (UpperCase ||LowerCase){
            System.out.println("enter character is  letter ");
        }else {
            System.out.println("enter character is not letter ");
        }







    }
}
