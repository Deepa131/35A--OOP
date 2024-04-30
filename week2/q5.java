package Task.week2;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        /*Write a program to take two integer inputs from the user and print the sum and product of them. */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first num");
        int num1=input.nextInt();
        System.out.println("Enter second num");
        int num2=input.nextInt();
        System.out.println("Sum="+(num1+num2));
        System.out.println("Product="+(num1*num2));
        input.close();
    }
}
