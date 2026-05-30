//package JavaConceptNo01.challenges;
// Here is the Java program to calculate the product of two floating-point numbers:
import java.util.Scanner; // Import Scanner class for user input

public class cha09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Taking two floating-point numbers as input from the user
        System.out.print("Enter the first floating-point number: ");
        float num1 = scanner.nextFloat(); // Read the first number

        System.out.print("Enter the second floating-point number: ");
        float num2 = scanner.nextFloat(); // Read the second number

        // Calculating the product
        float product = num1 * num2;

        // Displaying the result
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        scanner.close(); // Close the scanner
    }
}

