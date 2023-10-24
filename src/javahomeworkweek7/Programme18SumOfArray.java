package javahomeworkweek7;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme18SumOfArray {
    public static void main(String[] args) {
        // Define an array of numbers
        int [] numbers = {5, 10, 15, 20, 25};
        // Initialize a variable to store the sum
        int sum = 0;
        // Calculate the sum of values in the array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        // Print the sum
        System.out.println("Sum of the array elements: " + sum);
    }
}
