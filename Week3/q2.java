package Task.Week3;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        /*Write a JAVA program to check whether a number is negative, positive, or zero. */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=input.nextInt();
        if (num>0) {
            System.out.println("It is positive");
        }else if (num<0) {
            System.out.println("It is negative");
        }else{
            System.out.println("Zero");
        }
        input.close();
    }
}
