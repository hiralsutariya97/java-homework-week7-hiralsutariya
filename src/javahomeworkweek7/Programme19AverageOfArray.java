package javahomeworkweek7;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme19AverageOfArray {
    public static void main(String[] args) {
        // Define an array of numbers
        int [] numbers = {5, 10, 15, 20, 25};
        // Initialize variables for sum and count
        int sum = 0;
        int count = numbers.length;
        // Calculate the sum of array elements
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        // Calculate the average
        double average = (double) sum / count;
        // Print the average
        System.out.println("Average of the array elements: " + average);
    }
}
