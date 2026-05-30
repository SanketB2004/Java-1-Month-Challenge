package JavaConceptNo01.operators_if_else_number04;

import java.util.Scanner;

public class RelationalOperator {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        // Example 1: Greater than or equal to (>=)
        if (age >= 18) {
            System.out.println("You are eligible to join the army.");
        } else {
            System.out.println("You are a child and not eligible.");
        }

        // Example 2: Less than (<)
        System.out.println("\nChecking if age is less than 18:");
        if (age < 18) {
            System.out.println("You are under 18.");
        } else {
            System.out.println("You are 18 or older.");
        }

        // Example 3: Greater than (>)
        System.out.println("\nChecking if age is greater than 21:");
        if (age > 21) {
            System.out.println("You are older than 21.");
        } else {
            System.out.println("You are 21 or younger.");
        }

        // Example 4: Less than or equal to (<=)
        System.out.println("\nChecking if age is less than or equal to 16:");
        if (age <= 16) {
            System.out.println("You are 16 or younger.");
        } else {
            System.out.println("You are older than 16.");
        }

        // Example 5: Equal to (==)
        System.out.println("\nChecking if age is equal to 25:");
        if (age == 25) {
            System.out.println("You are 25 years old.");
        } else {
            System.out.println("You are not 25 years old.");
        }

        // Example 6: Not equal to (!=)
        System.out.println("\nChecking if age is not equal to 30:");
        if (age != 30) {
            System.out.println("You are not 30 years old.");
        } else {
            System.out.println("You are exactly 30 years old.");
        }

        // Close the scanner
        input.close();
    }
}
