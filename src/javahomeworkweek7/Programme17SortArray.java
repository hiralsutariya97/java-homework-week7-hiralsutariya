package javahomeworkweek7;
/**
 * Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Programme17SortArray {
    public static void main(String[] args) {
        // Sorting a numeric array
        int [] numericArray = {5, 1, 3, 7, 2, 4};
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

        // Sorting a string array
        String[] stringArray = {"apple", "banana", "cherry", "date", "blueberry"};
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
