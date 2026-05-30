package JavaConceptNo01.challenges;

// Here is a Java program that categorizes a person into different age groups:

// Age Group Categories:
// Child → Below 13 years
// Teen → 13 to 19 years
// Adult → 20 to 59 years
// Senior → 60 years and above

import java.util.Scanner; // Import Scanner class for user input

public class cha19and20SameThisIsa20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Taking input from the user
        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt(); // Read the age

        // Determining the age category
        if (age < 13) {
            System.out.println("The person is a Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("The person is a Teen.");
        } else if (age >= 20 && age < 60) {
            System.out.println("The person is an Adult.");
        } else {
            System.out.println("The person is a Senior.");
        }

        scanner.close(); // Close the scanner
    }
}
