//package JavaConceptNo01.challenges;
import java.util.Scanner;

 public class cha32 {
    // package Challenge05;



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Number System : ");

        System.out.println("Please Enter Your Number : ");

        int first = input.nextInt(); // Taking first number as input from the user

        System.out.println("Please Enter Your Number : ");

        int second = input.nextInt(); // Taking second number as input from the user

        int lcm = lcm(first, second); // Calling the lcm function to calculate LCM

        System.out.println("LCM of the two numbers is :" + lcm); // Displaying the result

    }

    // Function to find LCM of two numbers
    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i; // Multiplying first number with increasing values of i
            if (factor % second == 0) { // Checking if the multiple is divisible by the second number

                return factor; // Returning the LCM value

            }
            i++; // Incrementing i for the next multiple
        }
    }
}


