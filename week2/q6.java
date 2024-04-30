package Task.week2;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        /*Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
        Finally, calculate the division of the thus obtained sum and product and print the result. */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first num");
        int num1=input.nextInt();
        System.out.println("Enter second num");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("Sum="+sum);
        int product=num1*num2;
        System.out.println("Product="+product);
        float division=product/sum;
        System.out.println("Division="+division);
        input.close();
    }
}
