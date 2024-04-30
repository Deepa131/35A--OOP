package Task.week2;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        /*Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the base of triangle");
    int base=input.nextInt();
    System.out.println("Enter the height");
    int height=input.nextInt();
    System.out.println("Area of triangle="+(base*height)/2);
    System.out.println("Enter length of cuboid");
    int length=input.nextInt();
    System.out.println("Enter width of cuboid");
    int width=input.nextInt();
    System.out.println("Volume of cuboid="+length*+width*+height);
    System.out.println("Enter side");
    int side=input.nextInt();
    System.out.println("Volume of cube="+(side*side*side));
    input.close();
    }
}
