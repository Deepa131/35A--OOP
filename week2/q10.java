package Task.week2;

public class q10 {
    public static void main(String[] args) {
        /*Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

a. If equal to or more than 70 -> First Class

b. If more than 59 -> Upper Second Class

c. If more than 49 -> Second class

d. If more than 39 -> Third class and if below than 40 the result is fail. 

Hint: Use ternary operator */
        Scanner input=new Scanner(System.in);
        System.out.println("Marks of Science");
        int Science=input.nextInt();
        System.out.println("Marks of Maths");
        int Maths=input.nextInt();
        System.out.println("Marks of English");
        int English=input.nextInt();
        System.out.println("Marks of Nepali");
        int Nepali=input.nextInt();
        int Total_marks=Science+Maths+English+Nepali;
        System.out.println(Total_marks);
        float Percentage=(Total_marks/400)*100;
        System.out.println(Percentage);
        String result=(Percentage>=70 ) ? "First Class"
    }
}
