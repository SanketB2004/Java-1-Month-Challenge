package JavaConceptNo01.challenges;
import java.util.Scanner;

public class cha31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt(); // Take number input from the user
        input.close(); // Close the Scanner to prevent resource leak
        
        int sum = 0;
        
        while (num != 0) {  
            sum += num % 10; // Extract the last digit and add it to sum
            num /= 10; // Remove the last digit from the number
        }

        System.out.println("Sum of digits: " + sum); // Print the sum of digits
    }
}