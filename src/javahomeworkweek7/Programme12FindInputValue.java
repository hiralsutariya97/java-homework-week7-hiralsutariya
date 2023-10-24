package javahomeworkweek7;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Programme12FindInputValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char character = scanner.next().charAt(0);
        if (Character.isLetter(character)) {
            System.out.println("The input is an alphabet.");
        } else if (Character.isDigit(character)) {
            System.out.println("The input is a number.");
        } else {
            System.out.println("The input is a symbol or special character.");
            scanner.close();
        }
    }
}
