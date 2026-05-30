//package JavaConceptNo01.challenges;
// Here is a Java program to convert Fahrenheit to Celsius using the formula:

import java.util.Scanner; // Import Scanner class for user input

public class cha14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Taking input for temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble(); // Read Fahrenheit value

        // Converting Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Displaying the result
        System.out.println("Temperature in Celsius: " + celsius);

        scanner.close(); // Close the scanner
    }
}
