//package JavaConceptNo01.challenges;
import java.util.Scanner;
public class cha30 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: "); // Prompt user for input
        int number = scanner.nextInt(); // Read integer input from the user
        scanner.close(); // Close the scanner to prevent resource leak
        
        long factorial = 1; // Variable to store factorial result, initialized to 1
        
        // Loop starts from 2 as multiplying by 1 is redundant
        for (int i = 2; i <= number; i++) {
            factorial *= i; // Multipl100y current number to compute factorial
        }
        
        // Display the calculated factorial value to the user
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
