//package JavaConceptNo01.challenges;

// Here is a Java program to determine the greatest of three numbers:
import java.util.Scanner; // Import Scanner class for user input

public class cha17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Taking input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double greatest;

        // Checking for the greatest number
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        // Displaying the result
        System.out.println("The greatest number is: " + greatest);

        scanner.close(); // Close the scanner
    }
}



