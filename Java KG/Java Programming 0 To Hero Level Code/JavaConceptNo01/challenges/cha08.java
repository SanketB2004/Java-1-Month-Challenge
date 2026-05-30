// Java program that takes two numbers as input and performs all arithmetic operations:?
package JavaConceptNo01.challenges;
import java.util.Scanner; // Importing Scanner class to take user input

public class cha08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object for input

        // Taking input from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble(); // Reading first number

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble(); // Reading second number

        // Performing arithmetic operations
        double addition = num1 + num2; // Addition
        double subtraction = num1 - num2; // Subtraction
        double multiplication = num1 * num2; // Multiplication
        double division = num1 / num2; // Division (returns decimal result)
        double floorDivision = Math.floor(num1 / num2);  // Floor division (integer approximation)
        double modulus = num1 % num2; // Modulus (remainder of division)
        double exponentiation = Math.pow(num1, num2); // Exponentiation (num1 raised to num2)

        // Displaying results
        System.out.println("\nResults:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Floor Division (Integer Division Approximation): " + (int)floorDivision);
        System.out.println("Modulus (Remainder): " + modulus);
        System.out.println("Exponentiation (Power): " + exponentiation);

        scanner.close(); // Closing the scanner to prevent memory leaks
    }
}
