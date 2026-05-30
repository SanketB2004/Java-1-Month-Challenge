//package JavaConceptNo01.challenges;
import java.util.Scanner;

public class cha39 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user for input
        System.out.println("Welcome To Star Pattern System:");
        System.out.print("Please Enter the Number of Rows: ");

        int row = input.nextInt(); // Read user input
        input.close(); // Closing scanner to prevent memory leaks

        // Calling all pattern functions
        printFirstPattern(row);
        printSecondPattern(row);
        printThirdPattern(row);
    }

    // 1st Pattern (Left Aligned Increasing Triangle)
    public static void printFirstPattern(int maxRows) {
        System.out.println("\nFirst Pattern (Increasing Triangle):");

        int row = 0;
        while (row < maxRows) {
            System.out.print("*"); // Print first star

            int second = 0;
            while (second < row) { // Print remaining stars with spaces
                System.out.print(" *");
                second++;
            }

            System.out.println(); // Move to the next line
            row++;
        }
    }

    // 2nd Pattern (Left Aligned Decreasing Triangle)
    public static void printSecondPattern(int maxRows) {
        System.out.println("\nSecond Pattern (Decreasing Triangle):");

        int row = maxRows;
        while (row > 0) {
            int second = 0;
            while (second < row) { // Print stars in decreasing order
                System.out.print("* ");
                second++;
            }

            System.out.println(); // Move to the next line
            row--;
        }
    }

    // 3rd Pattern (Left-Aligned Half Pyramid)
    public static void printThirdPattern(int maxRows) {
        System.out.println("\nThird Pattern (Left Half Pyramid):");

        int rows = maxRows;
        while (rows > 0) {
            // Print spaces before stars
            int j = 0;
            while (j < rows - 1) {
                System.out.print("  "); // Print double spaces for alignment
                j++;
            }

            // Print stars
            int i = 0;
            while (i <= (maxRows - rows)) {
                System.out.print("* ");
                i++;
            }

            System.out.println(); // Move to the next line
            rows--;
        }
    }
}
