package javahomeworkweek7;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid  Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;

public class Programme3MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student's Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student's Roll No: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter Math marks (0-100): ");
        int mathMarks = scanner.nextInt();
        System.out.print("Enter Science marks (0-100): ");
        int scienceMarks = scanner.nextInt();
        System.out.print("Enter English marks (0-100): ");
        int englishMarks = scanner.nextInt();
        scanner.close();

        // Check if marks are in the valid range
        if (isValidMark(mathMarks) && isValidMark(scienceMarks) && isValidMark(englishMarks)) {
            int totalMarks = mathMarks + scienceMarks + englishMarks;
            double percentage = (totalMarks / 300.0) * 100;
            String result = (percentage >= 35) ? "Pass" : "Fail";
            String grade = calculateGrade(percentage);
// Print Mark Sheet

            System.out.println("|--------------------------------|");
            System.out.println("|            Mark Sheet         |");
            System.out.println("|-------------------------------|");
            System.out.println("|Name       :" + "               |");
            System.out.println("|Roll No     :" + "             |");
            System.out.println("|-------------------------------|");
            System.out.println("|Subjects    :   Marks           |");
            System.out.println("|-------------------------------|");
            System.out.println("|Math        :" + mathMarks + "      |");
            System.out.println("|Science     :" + scienceMarks + "   |");
            System.out.println("|English     :" + englishMarks + "   |");
            System.out.println("|--------------------------------|");
            System.out.println("|Total       :" + totalMarks + "     |");
            System.out.println("|--------------------------------|");
            System.out.println("|Percentage  :" + percentage + "     |");
            System.out.println("|Result      :" + result + "         |");
            System.out.println("|Grade       :" + grade + "          |");
            System.out.println("|--------------------------------|");

        } else {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }
    }

    // Function to check if a mark is in the valid range
    public static boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }

    // Function to calculate the grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "D";

        }

    }
}


