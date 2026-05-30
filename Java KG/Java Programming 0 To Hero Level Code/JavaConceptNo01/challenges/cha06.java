package JavaConceptNo01.challenges;
//Create a Program addd Two numbers?
import java.util.Scanner;  // Import Scanner class for user input

public class cha06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object for input

        // Taking first number input
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        // Taking second number input
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Calculating sum
        int sum = num1 + num2;

        // Displaying the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        input.close();  // Closing scanner to avoid resource leak
    }
}
