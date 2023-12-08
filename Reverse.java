import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sr.nextInt();

        int reverse = 0;

        while (number != 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;
        }

        System.out.println("Reverse of the number" + "(" + n + ")" + " is: " + reverse);
    }
}
