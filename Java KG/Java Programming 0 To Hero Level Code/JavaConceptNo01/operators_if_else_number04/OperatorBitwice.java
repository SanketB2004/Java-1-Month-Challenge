//package JavaConceptNo01.operators_if_else_number04;

import java.util.Scanner;

public class OperatorBitwice {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt user to enter first number
        System.out.println("Enter the first number for Bitwise Operations:");
        int a = input.nextInt();

        // Prompt user to enter second number
        System.out.println("Enter the second number for Bitwise Operations:");
        int b = input.nextInt();

        // 1. Bitwise AND (&) - Both bits must be 1
        int andResult = a & b;
        System.out.println("\nBitwise AND (a & b): " + andResult);

        // 2. Bitwise OR (|) - At least one bit must be 1
        int orResult = a | b;
        System.out.println("Bitwise OR (a | b): " + orResult);

        // 3. Bitwise XOR (^) - Bits must be different
        int xorResult = a ^ b;
        System.out.println("Bitwise XOR (a ^ b): " + xorResult);

        // 4. Bitwise Complement (~) - Inverts all bits of 'a'
        int complementResult = ~a;
        System.out.println("Bitwise Complement (~a): " + complementResult);

        // 5. Left Shift (<<) - Shifts bits to the left (multiplies by 2^n)
        int leftShift = a << 2;
        System.out.println("Left Shift (a << 2): " + leftShift);

        // 6. Right Shift (>>) - Shifts bits to the right (divides by 2^n)
        int rightShift = a >> 2;
        System.out.println("Right Shift (a >> 2): " + rightShift);

        // 7. Unsigned Right Shift (>>>) - Fills left bits with 0
        int unsignedRightShift = a >>> 2;
        System.out.println("Unsigned Right Shift (a >>> 2): " + unsignedRightShift);

        // Close the scanner
        input.close();
    }
}
