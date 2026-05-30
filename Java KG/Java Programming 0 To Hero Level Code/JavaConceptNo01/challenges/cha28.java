//package JavaConceptNo01.challenges;

import java.util.Scanner;

public class cha28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int i = 1; // Start from 1

        // Loop prints multiples of the given number up to 10 times
        while (i <= 10) {
            int result = i * number; // Calculate multiplication result
            System.out.println(i + " * " + number + " = " + result);
            i++; // Increment i
        }

        input.close(); // Close Scanner
    }
}
