package javahomeworkweek7;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */
import java.util.Scanner;

public class Programme6OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);
        scanner.close();
    }
}

