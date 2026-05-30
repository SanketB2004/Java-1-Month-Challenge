 //package JavaConceptNo01.challenges;
import java.util.Scanner;

public class cha36 { // Fixed class name

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Number System:");
        System.out.print("Please Enter Your Number: ");

        int num = input.nextInt();
        System.out.println("Here is the Fibonacci Sequence:");
        printFibonacci(num);

        input.close(); // Closing scanner
    }

    public static void printFibonacci(int num) { // Fixed spelling
        if (num < 0) return;

        System.out.print("0 ");
        if (num == 0) return;

        System.out.print("1 ");
        if (num == 1) return;

        int first = 0, second = 1;

        while (true) {
            int next = first + second;
            if (next > num) break; // Stop if the next Fibonacci number exceeds num
            System.out.print(next + " ");
            first = second;
            second = next;
        }

        System.out.println(); // Print newline for better formatting
    }
}
