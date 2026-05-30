//Sapackage JavaConceptNo01.DataTypes_Variable_Input03;
import java.util.Scanner;  // Import Scanner class for user input

public class challenge {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // ---------------------- Challenge 1: Greeting User ----------------------
        System.out.println("=== Challenge 1: Greeting Program ===");

        // Prompt user to enter their name
        System.out.print("Please Enter Your Name: ");
        String name = input.nextLine();  // Read the name as a string

        // Display a personalized welcome message
        System.out.println("Welcome " + name + " to KG Coding!");
        System.out.println();  // Blank line for better output formatting

        // ---------------------- Challenge 2: Sum of Two Numbers ----------------------
        System.out.println("=== Challenge 2: Addition Program ===");

        // Prompt user to enter the first number
        System.out.print("Enter First Number: ");
        int firstNumber = input.nextInt();  // Read first integer input

        // Prompt user to enter the second number
        System.out.print("Enter Second Number: ");
        int secondNumber = input.nextInt();  // Read second integer input

        // Calculate the sum of the two numbers
        int sum = firstNumber + secondNumber;

        // Display the result
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);

        // ---------------------- End of Program ----------------------
        // Close the Scanner object to prevent resource leaks
        input.close();
        System.out.println("\nThank you for using the Challenge Program. Goodbye!");
    }
}
