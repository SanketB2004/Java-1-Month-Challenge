// package JavaConceptNo01.DataTypes_Variable_Input03;
// import java.util.Scanner;

// public class userinpu {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // 1. Greet User by Name
//         System.out.println("\n1️⃣  Enter your Name:");
//         String name = input.nextLine();
//         System.out.println("Good Morning, " + name + "! Welcome to KG Coding.\n");

//         // 2. Input Two Numbers with Validation (hasNextInt)
//         System.out.println("2️⃣  Enter Two Numbers for Addition:");

//         int firstNumber = getValidInteger(input, "Enter First Number: ");
//         int secondNumber = getValidInteger(input, "Enter Second Number: ");

//         int sum = firstNumber + secondNumber;
//         System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum + "\n");

//         // 3. Pass ID Example
//         input.nextLine(); // Consume newline left from nextInt()
//         System.out.println("3️⃣  Enter Your Pass ID:");
//         String passId = input.nextLine();
//         System.out.println("Done! Pass ID '" + passId + "' verified successfully.\n");

//         // 4. User Authentication with Password Check
//         int password = getValidInteger(input, "4️⃣  Enter Your 4-Digit Password: ");
//         if (password == 1234) {
//             System.out.println("Access Granted! Welcome to the Home Page.\n");
//         } else {
//             System.out.println("Access Denied! Incorrect Password.\n");
//         }

//         // 5. Personalized Greeting
//         System.out.println("5️⃣  Enter Your Name Again:");
//         String userName = input.nextLine();
//         System.out.println("Welcome " + userName + " to the Coding Classes!\n");

//         // Close the scanner
//         input.close();
//     }

//     // Method to get a valid integer using hasNextInt
//     private static int getValidInteger(Scanner input, String prompt) {
//         int number;
//         while (true) {
//             System.out.print(prompt);
//             if (input.hasNextInt()) {
//                 number = input.nextInt();
//                 break; // Exit the loop if valid input
//             } else {
//                 System.out.println("❌ Invalid input! Please enter a valid integer.");
//                 input.next(); // Clear the invalid input
//             }
//         }
//         return number;
//     }
// }

import java.util.Scanner;

public class userinpu {

    public static void main(String[] args) {
        System.out.println("User Input");

        Scanner input = new Scanner(System.in);
        // input.nextLine(); // Consume newline left from nextInt()
        // System.out.println("3️⃣  Enter Your Pass ID:");
        // String passId = input.nextLine();
        // System.out.println("Done! Pass ID '" + passId + "' verified successfully.\n");


        // System.out.println("Hiii Sanket ");
        // String a = input.nextLine();
        // System.out.println(a);
     
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("तुम्ही दिलेला नंबर: " + number);
        } else {
            System.out.println("हे पूर्णांक नाही!");
        }

     
     
     System.out.println(a);
    }


}