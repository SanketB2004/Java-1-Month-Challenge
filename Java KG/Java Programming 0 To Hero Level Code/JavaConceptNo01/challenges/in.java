
// import java.util.Scanner;

// public class cha29 {  // Class names should start with an uppercase letter

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Display welcome message
//         System.out.println("Welcome to the Odd Sum Calculator");
        
//         // Prompt user for input
//         System.out.print("Enter a number: ");
//         int num = input.nextInt();

//         // Calculate the sum of odd numbers up to num
//         int sum = calculateOddSum(num);

//         // Display the result
//         System.out.println("Sum of odd numbers up to " + num + " is: " + sum);

//         input.close(); // Close the Scanner to prevent resource leaks
//     }

//     /**
//      * Method to calculate the sum of all odd numbers up to a given number.
//      * 
//      * @param num The limit up to which odd numbers should be summed
//      * @return The sum of all odd numbers up to num
//      */
//     public static int calculateOddSum(int num) {
//         int sum = 0;
//         int i = 1; // Start from the first odd number (1)

//         // Loop to add only odd numbers
//         while (i <= num) {
//             sum += i;
//             i += 2; // Increment by 2 to move to the next odd number
//         }
        
//         return sum; // Return the calculated sum
//     }
// }



