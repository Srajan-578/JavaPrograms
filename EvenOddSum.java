import java.util.Scanner;

public class Even_Odd_SumCalculator {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = sr.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter the integers:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
    }
}
