package ssg9switch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        //write a program to check Vowel or Consonant letters in English:


        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter an english character ");

        char ch = input.next().charAt(0);//


        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("vowel letter");
                break;

            default:
                System.out.println("consonant letter");

        }
    }
}
