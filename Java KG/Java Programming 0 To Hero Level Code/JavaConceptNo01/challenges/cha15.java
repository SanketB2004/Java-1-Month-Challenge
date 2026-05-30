//package JavaConceptNo01.challenges;

// Here is a Java program to determine whether a number is positive, negative, or zero:

import java.util.Scanner; // Import Scanner class for user input

public class cha15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Taking input from the user
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble(); // Read the number

        // Checking if the number is positive, negative, or zero
        if (num > 0) {
            System.out.println("The number is Positive.");
        } else if (num < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close(); // Close the scanner
    }
}
