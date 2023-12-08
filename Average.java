import java.util.*;

public class Average_Calculator {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Enter number A: ");
        double A = sr.nextDouble();

        System.out.print("Enter number B: ");
        double B = sr.nextDouble();

        System.out.print("Enter number C: ");
        double C = sr.nextDouble();

        double average = (A + B + C) / 3;

        System.out.println("Average of A, B, and C is: " + average);
    }
}
