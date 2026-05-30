package JavaConceptNo01.challenges;
// Here is a Java program to calculate Compound Interest using the formula:

import java.util.Scanner; // Import Scanner class for user input

public class cha13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Taking input for Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble(); // Read Principal

        System.out.print("Enter the Rate of Interest (per annum in %): ");
        double rate = scanner.nextDouble(); // Read Rate

        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble(); // Read Time

        // Calculating Compound Interest
        double amount = principal * Math.pow((1 + rate / 100), time); // Final amount
        double compoundInterest = amount - principal; // CI = A - P

        // Displaying the result
        System.out.println("The Compound Interest is: " + compoundInterest);
        System.out.println("The Total Amount after interest is: " + amount);

        scanner.close(); // Close the scanner
    }
}
