package javahomeworkweek7;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme20FindValueInArray {
    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {5, 10, 15, 20, 25};

        // Value to search for
        int targetValue = 15;

        // Initialize a boolean flag to track if the value is found
        boolean found = false;

        // Iterate through the array to check if it contains the target value
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break; // exit the loop once found
            }
        }

        // Check and print the result
        if (found) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}
