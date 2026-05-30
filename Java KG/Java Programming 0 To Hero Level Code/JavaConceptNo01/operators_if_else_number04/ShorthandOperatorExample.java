package JavaConceptNo01.operators_if_else_number04;

import java.util.Scanner;

public class ShorthandOperatorExample {

    public static void main(String[] args) {

        // Initialize variable 'a' with value 5
        int a = 5;

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Example 1: Using shorthand addition operator (+=)
        System.out.println("Enter first number (x1):");
        int x1 = input.nextInt();
        a += x1;  // Equivalent to: a = a + x1
        System.out.println("After adding x1, a = " + a);

        // Example 2: Without shorthand (traditional addition)
        System.out.println("Enter second number (x2):");
        int x2 = input.nextInt();
        a = a + x2;  // Traditional addition
        System.out.println("After adding x2, a = " + a);

        // Example 3: Shorthand addition again
        System.out.println("Enter third number (x3):");
        int x3 = input.nextInt();
        a += x3;  // Same as a = a + x3
        System.out.println("After adding x3, a = " + a);

        // Example 4: Final addition example
        System.out.println("Enter fourth number (x4):");
        int x4 = input.nextInt();
        a += x4;  // Equivalent to: a = a + x4
        System.out.println("After adding x4, a = " + a);

        // Close the scanner
        input.close();
    }
}
