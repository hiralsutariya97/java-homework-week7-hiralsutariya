package javahomeworkweek7;
/**
 * Write a Java program which input any number between 1 to 7 and it print The Days  name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

import java.util.Scanner;

public class Programme13FindTheDayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "MONDAY";
                break;
            case 2:
                dayName = "TUESDAY";
                break;
            case 3:
                dayName = "WEDNESDAY";
                break;
            case 4:
                dayName = "THURSDAY";
                break;
            case 5:
                dayName = "FRIDAY";
                break;
            case 6:
                dayName = "SATURDAY";
                break;
            case 7:
                dayName = "SUNDAY";
                break;
            default:
                dayName = "Week contains 1 to 7 days";
        }

        System.out.println("Day of the week: " + dayName);
        scanner.close();
    }
}
