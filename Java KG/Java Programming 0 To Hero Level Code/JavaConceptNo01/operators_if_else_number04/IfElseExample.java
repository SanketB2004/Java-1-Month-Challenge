//package JavaConceptNo01.operators_if_else_number04;

import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input (true or false)
        System.out.print("Enter true or false: ");
        boolean ame = input.nextBoolean();  // Boolean input from user

        String name = "Bob";  // Example name

        // First if-else condition to check the boolean value
        if (ame) {
            System.out.println("Before If");
            System.out.println("Mr. " + name);  // Displays "Mr. Bob" if true
        } else {
            System.out.println("Mr. Bob is busy");  // If false, this message appears
            System.out.println("After If");
        }

        System.out.println("\nAre you a Senior Citizen or an Adult?");

        // Example of multiple conditions
        boolean isSenior = true;
        boolean isAdult = true;

        // Check user category based on conditions
        if (isSenior) {
            System.out.println("Hi, Senior Citizen!");  // Executes if 'isSenior' is true
        } else if (isAdult) {
            System.out.println("Hello, Adult!");        // Executes if 'isAdult' is true
        } else {
            System.out.println("Hi, Child! No entry to the pub.");  // Executes if both are false
        }

        input.close();  // Closing scanner to avoid resource leak
    }
}

