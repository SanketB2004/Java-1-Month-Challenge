//package JavaConceptNo01.challenges;

// Here is a Java program to determine whether a given year is a leap year or not:

// Leap Year Rules:
// A year is a leap year if:

// It is divisible by 4 AND
// It is not divisible by 100, unless it is also divisible by 400
import java.util.Scanner; // Import Scanner class for user input

public class cha18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Taking input from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Checking if the year is a leap year
        boolean isLeap = false;

        if (year % 4 == 0) { 
            if (year % 100 != 0 || year % 400 == 0) {
                isLeap = true;
            }
        }

        // Displaying the result
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        scanner.close(); // Close the scanner
    }
}
