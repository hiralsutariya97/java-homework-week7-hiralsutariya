package javahomeworkweek7;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if  any other alphabet should be invalid entry
 */
import java.util.Scanner;

public class Programme8PrintCityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);
        String cityName;
        if (alphabet == 'A') {
            cityName = "Albany";
        } else if (alphabet == 'B') {
            cityName = "Boston";
        } else if (alphabet == 'C') {
            cityName = "Chicago";
        } else if (alphabet == 'D') {
            cityName = "Dallas";
        } else if (alphabet == 'E') {
            cityName = "El Paso";
        } else if (alphabet == 'F') {
            cityName = "Fresno";
        } else {
            cityName = "Invalid entry";
        }
        System.out.println("City Name: " + cityName);
        scanner.close();
    }
}
