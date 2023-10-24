package javahomeworkweek7;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */

import java.util.Scanner;

public class Programme16FindPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        if (number > 0) {
            System.out.println("POSITIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }
        scanner.close();
    }
}
