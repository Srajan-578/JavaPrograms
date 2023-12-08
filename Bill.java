import java.util.*;

public class Bill_Calculator {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Enter the cost of the pencil: ");
        float pC = sr.nextFloat();

        System.out.print("Enter the cost of the pen: ");
        float penC = sr.nextFloat();

        System.out.print("Enter the cost of the eraser: ");
        float eC = sr.nextFloat();

        float totalCost = pC + penC + eC;

        // Add 18% GST
        float gst = 0.18f;
        float totalCostWithGST = totalCost + (totalCost * gst);

        System.out.println("Total cost of items without GST: " + totalCost);
        System.out.println("Total cost of items with 18% GST: " + totalCostWithGST);
    }
}
