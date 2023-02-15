package ssg11whiledowhileloop;

public class ForWhileDoWhileLoop {

    public static void main(String[] args) {

        //Question 1) Print numbers 1 to 5 (including 1 and 5) on the same line

        // for loop

        for (int i = 1; i <=5 ; i++) {

            System.out.print(i+ " ");

        }
        System.out.println();

        //
        int k=1;
        while (k<=5){
            System.out.print(k+ " ");
            k++;
        }

        //do while

        System.out.println();
        int j=1;
        do{
            System.out.print(j+ " ");
            j++;
        }while (j<=5);


    }
}
