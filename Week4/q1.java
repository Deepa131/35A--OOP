package Task.Week4;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
    /*1. Write a program that asks your name and prints “Hello your name” five times. Use a loop. */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.nextLine();
        for(int index=0; index<5; index++) {
            System.out.println("Hello "+name);
        }
        input.close();
    }
}
