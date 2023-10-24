package javahomeworkweek7;
/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *) find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 */

import java.util.Scanner;

public class Programme10DoOperationWithSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter a mathematical symbol (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid mathematical symbol.");
            scanner.close();
        }
    }
}
