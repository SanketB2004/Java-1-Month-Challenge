package JavaConceptNo01.challenges;

import java.util.Scanner;

// Program21 - Bitwise AND
class Program21 {
    public void bitwiseAND(int a, int b) {
        System.out.println("Bitwise AND (" + a + " & " + b + ") = " + (a & b));
    }
}

// Program22 - Bitwise OR
class Program22 {
    public void bitwiseOR(int a, int b) {
        System.out.println("Bitwise OR (" + a + " | " + b + ") = " + (a | b));
    }
}

// Program23 - Bitwise XOR
class Program23 {
    public void bitwiseXOR(int a, int b) {
        System.out.println("Bitwise XOR (" + a + " ^ " + b + ") = " + (a ^ b));
    }
}

// Program24 - Bitwise Complement
class Program24 {
    public void bitwiseComplement(int a, int b) {
        System.out.println("Bitwise Complement (~" + a + ") = " + (~a));
        System.out.println("Bitwise Complement (~" + b + ") = " + (~b));
    }
}

// Program25 - Left Shift
class Program25 {
    public void leftShift(int a, int shift) {
        System.out.println("Left Shift (" + a + " << " + shift + ") = " + (a << shift));
    }
}

// Program26 - Right Shift
class Program26 {
    public void rightShift(int a, int shift) {
        System.out.println("Right Shift (" + a + " >> " + shift + ") = " + (a >> shift));
    }
}

// Main Class
public class Bitwise21to26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter shift amount: ");
        int shift = scanner.nextInt();

        // Creating objects for each class
        Program21 andOp = new Program21();
        Program22 orOp = new Program22();
        Program23 xorOp = new Program23();
        Program24 complementOp = new Program24();
        Program25 leftShiftOp = new Program25();
        Program26 rightShiftOp = new Program26();

        // Performing operations
        System.out.println("\nBitwise Operations:");
        andOp.bitwiseAND(num1, num2);
        orOp.bitwiseOR(num1, num2);
        xorOp.bitwiseXOR(num1, num2);
        complementOp.bitwiseComplement(num1, num2);
        leftShiftOp.leftShift(num1, shift);
        rightShiftOp.rightShift(num1, shift);

        scanner.close();
    }
}
