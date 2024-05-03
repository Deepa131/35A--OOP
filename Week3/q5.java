package Task.Week3;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        /*Write a JAVA program to check whether a year is a leap year or not. 

Hint: if year%4==0; if year%100!==0 ; year%400==0;  */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any year");
        int year=input.nextInt();
        if (year%4==0) {
            System.out.println("It is leap year");
        }else {
            System.out.println("It isnot leap year");
        }
        input.close();
    }
}
