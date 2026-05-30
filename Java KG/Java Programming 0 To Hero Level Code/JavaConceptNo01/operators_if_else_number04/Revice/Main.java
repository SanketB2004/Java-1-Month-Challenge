package JavaConceptNo01.operators_if_else_number04.Revice;

/**
 * 
 * 
 * sanket
 */


public class Main {

    public static void main(String[] args) {

        // [1] Assignment Operator
        int aa = 55;  // Assigning value 55 to variable 'aa'
        System.out.println("Assignment Operator Example: " + aa);

        // Challenge: Swap Numbers
        int a;
        int b = 10;
        int c = b;  // Temporary variable to hold value of 'b'
        a = b;      // Assign 'b' value to 'a'
        b = c;      // Swap complete
        System.out.println("Swapped Value of A: " + a);

        // [2] Arithmetic Operators
        int plus = 5;
        int subtraction = 3;

        System.out.println("\nArithmetic Operator Examples:");
        System.out.println("Addition: " + (plus + subtraction));  // 5 + 3 = 8
        System.out.println("Subtraction: " + (plus - subtraction)); // 5 - 3 = 2
        System.out.println("Multiplication: " + (plus * subtraction)); // 5 * 3 = 15
        System.out.println("Division: " + (plus / subtraction)); // 5 / 3 = 1 (integer division)
        System.out.println("Modulus (Remainder): " + (plus % subtraction)); // 5 % 3 = 2

        // [3] Order of Operations (BODMAS)
        System.out.println("\nOrder of Operations Example:");
        System.out.println(8 - 3 * 3);  // 3*3=9 → 8-9 = -1
        System.out.println(8 - 3 * 3 - 3); // 3*3=9 → 8-9-3 = -4

        // [4] Shorthand Operator
        System.out.println("\nShorthand Operator Example:");
        int u = 5;
        u += 5; // Equivalent to u = u + 5;
        System.out.println("u += 5: " + u);

        // [5] Unary Operators
        System.out.println("\nUnary Operator Example:");
        int unary = 5;
        System.out.println("Original: " + unary);
        unary++; // Post-increment
        System.out.println("After Increment: " + unary);
        int reverse = 5;
        --reverse; // Pre-decrement
        System.out.println("After Decrement: " + reverse);

        // [6] If-Else Condition
        System.out.println("\nIf-Else Example:");
        int age = 19;
        if (age >= 18) {
            System.out.println("Eligible for Voting");
        } else {
            System.out.println("Not Eligible for Voting");
        }

        // [7] Comparison Operators
        System.out.println("\nComparison Operator Example:");
        int equal = 12;
        int non = 45;

        System.out.println("Equal: " + (equal == non)); // false
        System.out.println("Not Equal: " + (equal != non)); // true
        System.out.println("Greater Than: " + (equal > non)); // false
        System.out.println("Less Than: " + (equal < non)); // true
        System.out.println("Greater or Equal: " + (equal >= non)); // false
        System.out.println("Less or Equal: " + (equal <= non)); // true

        // [8] Logical Operators
        System.out.println("\nLogical Operator Example:");
        int sa = 77;
        int as = 77;

        if (sa == as || as > 50) { // Both conditions must be true
            System.out.println("Both conditions are true.");
        } else if (sa == as || as < 50) { // One condition must be true
            System.out.println("One condition is true.");
        } else {
            System.out.println("Both conditions are false.");
        }
    }
}
