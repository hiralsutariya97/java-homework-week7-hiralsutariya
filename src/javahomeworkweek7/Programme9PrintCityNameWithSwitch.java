package javahomeworkweek7;
/**
 * Same as above program-8 using switch statement.
 */

import java.util.Scanner;

public class Programme9PrintCityNameWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);
        String cityName;
        switch (alphabet) {
            case 'A':
                cityName = "Albany";
                break;
            case 'B':
                cityName = "Boston";
                break;
            case 'C':
                cityName = "Chicago";
                break;
            case 'D':
                cityName = "Dallas";
                break;
            case 'E':
                cityName = "El Paso";
                break;
            case 'F':
                cityName = "Fresno";
                break;
            default:
                cityName = "Invalid entry";
        }

        System.out.println("City Name: " + cityName);
        scanner.close();
    }
}
