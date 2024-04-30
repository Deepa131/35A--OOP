package Task.week2;
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        /*Take side of a square from user and print area and perimeter of it. 
        Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input. */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length");
        int length=input.nextInt();
        System.out.println("Area="+(length*length));
        System.out.println("Perimeter="+(4*length*length));
        System.out.println("Enter principle");
        int  principle=input.nextInt();
        System.out.println("Enter time");
        int time=input.nextInt();
        System.out.println("Enter rate");
        int rate=input.nextInt();
        System.out.println("Simple Interest="+principle*+time*+rate/+100);
        System.out.println("Enter the base of triangle");
        int base=input.nextInt();
        System.out.println("Enter the height");
        int height=input.nextInt();
        System.out.println("Area of triangle="+(base*height)/2);
        System.out.println("Enter length of cuboid");
        int length1=input.nextInt();
        System.out.println("Enter width of cuboid");
        int width=input.nextInt();
        System.out.println("Volume of cuboid="+length1*+width*+height);
        System.out.println("Enter side");
        int side=input.nextInt();
        System.out.println("Volume of cube="+(side*side*side));
        input.close()
    }
}
