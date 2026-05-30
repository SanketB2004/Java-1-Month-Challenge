package JavaConceptNo01.challenges;


import java.util.Scanner;

public class cha35 {  // Class name should follow PascalCase convention
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Number System: ");
        System.out.print("Please Enter Your Number: ");

        int num = input.nextInt();

        int reversedNum = reverseNumber(num); // Changed method name

        System.out.println("Reverse of your number is: " + reversedNum);

        input.close(); // Closing Scanner to prevent memory leaks
    }

    public static int reverseNumber(int num) { // Renamed method to avoid conflict
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
