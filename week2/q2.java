package Task.week2;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        /*Write a program to calculate SI. 

Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */
    Scanner input=new Scanner(System.in);
    System.out.println("Enter principle");
    int  principle=input.nextInt();
    System.out.println("Enter time");
    int time=input.nextInt();
    System.out.println("Enter rate");
    int rate=input.nextInt();
    System.out.println("Simple Interest="+principle*+time*+rate/+100);
    input.close();
    }
}
