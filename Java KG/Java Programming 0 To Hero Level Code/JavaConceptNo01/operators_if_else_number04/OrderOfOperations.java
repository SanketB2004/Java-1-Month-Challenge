package JavaConceptNo01.operators_if_else_number04;

public class OrderOfOperations {

    public static void main(String[] args) {
        
        // Declare variables for the calculations
        int a = 30;
        int b = 20;
        int c = 10;

        // Example 1: Basic multiplication and subtraction
        System.out.println("Example 1: " + (a * b - (c - a)));
        // Explanation: First, (c - a) = 10 - 30 = -20
        // Then, a * b = 30 * 20 = 600
        // Finally, 600 - (-20) = 620

        // Example 2: Division and addition inside parentheses
        System.out.println("Example 2: " + (9 / (3 / 3 + 2)));
        // Explanation: (3 / 3) = 1, then 1 + 2 = 3
        // 9 / 3 = 3

        // Example 3: Combination of addition, multiplication, and division
        System.out.println("Example 3: " + (10 + 20 * 5 / 2));
        // Explanation: 20 * 5 = 100, then 100 / 2 = 50
        // 10 + 50 = 60

        // Example 4: Complex expression with multiple operations
        System.out.println("Example 4: " + ((a + b) * c / 5 + b));
        // Explanation: (30 + 20) = 50
        // 50 * 10 = 500
        // 500 / 5 = 100
        // 100 + 20 = 120

        // Example 5: Modulus with addition and subtraction
        System.out.println("Example 5: " + (100 % 7 + a - b));
        // Explanation: 100 % 7 = 2 (remainder of 100/7)
        // 2 + 30 - 20 = 12
    }
}
