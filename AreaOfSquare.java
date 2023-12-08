import java.util.*;

public class Area_Calculator {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double s = sr.nextDouble();

        double area = s * s;

        System.out.println("Area of the square is: " + area);
    }
}
