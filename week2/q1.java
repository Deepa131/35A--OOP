package Task.week2;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        /*Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */
        Scanner input=new Scanner(System.in);
        System.out.println("Your age is: ");
        int age=input.nextInt();
        if (age>=18) {
            System.out.println("A person can cast a vote");
        }else{
            System.out.println("A person cannot cast a vote");
        }
        input.close();
    }
}
