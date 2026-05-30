
package JavaConceptNo01.challenges;
// Here's a Java program to calculate simple interest using the formula:

import java.util.Scanner; // Import Scanner class for user input

public class cha12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Taking input for Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble(); // Read Principal

        System.out.print("Enter the Rate of Interest (per annum in %): ");
        double rate = scanner.nextDouble(); // Read Rate

        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble(); // Read Time

        // Calculating Simple Interest (SI = (P * R * T) / 100)
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("The Simple Interest is: " + simpleInterest);

        scanner.close(); // Close the scanner
    }
}
