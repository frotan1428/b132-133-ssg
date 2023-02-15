package ssg08ifelseandnestedifstaements;

public class IfElse01 {

    public static void main(String[] args) {

        // If we have a day class, I can attend

        // If we have a night class, I can attend it


        boolean dt=true;
        boolean nt=false;


        // OR AND  & ||

        // T &  T ==> T
        //T || F ==> T

        // 1 * 0 --> 0 &
        // 1+0  == 1  ||

        if (dt & nt){
            System.out.println("you can join in the class");
        }else {
            System.out.println("you can not join the class ");
        }





    }
}
