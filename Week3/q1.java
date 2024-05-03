package Task.Week3;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        /*Write a JAVA program to find the maximum between three numbers. */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first num");
        int num1=input.nextInt();
        System.out.println("Enter second num");
        int num2=input.nextInt();
        System.out.println("Enter third num");
        int num3=input.nextInt();
        if (num1>num2&&num1>num3) {
            System.out.println("Maximun number is"+num1);
        }else if (num2>num1&&num2>num3) {
            System.out.println("Maximum number is"+num2);
        }else{
            System.out.println("Maximum number is"+num3);
        }
        input.close();
    }
}
