//package JavaConceptNo01.challenges;
// Here is a Java program to determine whether a number is odd or even:



import java.util.Scanner; // Import Scanner class for user input

public class cha16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Read the number

        // Checking if the number is odd or even
        if (num % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }

        scanner.close(); // Close the scanner
    }
}
