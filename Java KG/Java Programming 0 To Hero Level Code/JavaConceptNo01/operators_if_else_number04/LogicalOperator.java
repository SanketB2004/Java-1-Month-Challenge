//package JavaConceptNo01.operators_if_else_number04;

import java.util.Scanner;
/**
 * hii
 * 
 */
public class LogicalOperator {

    public static void main(String[] args) {

        System.out.println("Welcome to Ticket Discount Calculator!");

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Example 1: Age and Gender-based Discount
        System.out.print("\nExample 1 - Enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you male? (true/false): ");
        boolean isMale = input.nextBoolean();

        if (age < 5) {
            System.out.println("You get a 75% discount.");
        } else if (isMale) {
            System.out.println("You get a 50% discount.");
        } else if (age > 60 && !isMale) {
            System.out.println("You get a 99% discount.");
        } else {
            System.out.println("Sorry, no discount available.");
        }

        // Example 2: Checking Voting Eligibility
        System.out.print("\nExample 2 - Enter your age to check voting eligibility: ");
        int votingAge = input.nextInt();
        System.out.print("Do you have voter ID? (true/false): ");
        boolean hasVoterID = input.nextBoolean();

        if (votingAge >= 18 && hasVoterID) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        // Example 3: Exam Pass Criteria
        System.out.print("\nExample 3 - Enter your Math score: ");
        int mathScore = input.nextInt();
        System.out.print("Enter your Science score: ");
        int scienceScore = input.nextInt();

        if (mathScore >= 40 && scienceScore >= 40) {
            System.out.println("Congratulations! You passed the exam.");
        } else {
            System.out.println("You failed the exam. Try again.");
        }

        // Example 4: Login System
        System.out.print("\nExample 4 - Enter username: ");
        String username = input.next();
        System.out.print("Enter password: ");
        String password = input.next();

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful! Welcome, Admin.");
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }

        // Example 5: Weather Check
        System.out.print("\nExample 5 - Is it raining? (true/false): ");
        boolean isRaining = input.nextBoolean();
        System.out.print("Is it cold outside? (true/false): ");
        boolean isCold = input.nextBoolean();

        if (isRaining || isCold) {
            System.out.println("Take a jacket with you.");
        } else {
            System.out.println("The weather is fine. Enjoy your day!");
        }

        // Close the scanner


        input.close();

        int a = 10 ;
         while(a==10){
            System.out.print("SitaRam");
         }
    }
}

