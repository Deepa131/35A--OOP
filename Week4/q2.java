package Task.Week4;

public class q2 {
    public static void main(String[] args) {
        /*2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
Miles    Kilometers
1    1.609
2    3.218
…    ….
9    14.481
10    16.090 */
        System.out.println("Miles    Kilometers");
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609;
            System.out.println(miles + "        " + kilometers);
        }
    }
}
