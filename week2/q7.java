package Task.week2;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        /*Take the name, roll number, and field of interest from the user and print in the format below:
         Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.nextLine();
        System.out.println("Enter your roll number");
        int rollno=input.nextInt();
        System.out.println("Enter your field of interest");
        String fieldInterest=input.nextLine();
        System.out.println("Hey, my name is " +name+ " and my roll number is " +rollno+". My field of interest are " +fieldInterest);
        input.close();
    }
}
