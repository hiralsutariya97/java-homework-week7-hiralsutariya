package javahomeworkweek7;
/**
 * Write a java program that tells us that Input number is odd or even?
 *   HINT: use ternary operator(? :)
 */

import java.util.Scanner;

public class Programme1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int num1 = 23;
        if (num % 2 == 0) {
            System.out.println("The given number " + num + " is Even.");
        } else {
            System.out.println("The given number " + num + " is Odd.");
            scanner.close();
        }
    }
}





