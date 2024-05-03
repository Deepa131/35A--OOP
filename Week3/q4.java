package Task.Week3;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        /*Write a JAVA program to check whether a number is even or odd. */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=input.nextInt();
        if (num%2==0) {
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
        input.close();
    }
}
