package javahomeworkweek7;
/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
import java.util.Scanner;

public class Programme7SalesComission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input sales details
        System.out.println("Enter Sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();
        System.out.println("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.println("Enter Salary Basic: ");
        double salaryBasic = scanner.nextDouble();

        // Calculate Sales Commission
        double salesCommission = 0.0;
        if (salesAmount >= 50000) {
            salesCommission = 0.35 * salesAmount;
        } else if (salesAmount >= 30000) {
            salesCommission = 0.20 * salesAmount;
        } else if (salesAmount >= 20000) {
            salesCommission = 0.10 * salesAmount;
        } else if (salesAmount >= 10000) {
            salesCommission = 0.05 * salesAmount;
        } else {
            salesCommission = 0.02 * salesAmount;
        }

        // Print Sales Commission
        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Salary Basic: " + salaryBasic);
        System.out.println("Sales Commission: " + salesCommission);
        scanner.close();
    }
}
