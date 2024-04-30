package Task.week2;

public class q9 {
    public static void main(String[] args) {
        /*Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length");
        int length=input.nextInt();
        System.out.println("Enter breadth");
        int breadth=input.nextInt();
        System.out.println("Area of Rectangle="+(length*breadth));
    }
}
