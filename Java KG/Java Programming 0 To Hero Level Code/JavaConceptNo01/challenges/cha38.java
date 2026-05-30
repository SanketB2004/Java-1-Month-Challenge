package JavaConceptNo01.challenges;

import java.util.Scanner;

public class cha38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Number System:");
        System.out.print("Please Enter Your Number: ");

        int num = input.nextInt();
        input.close(); // Closing scanner

        boolean isPalindrome = isPalindrome(num);

        if (isPalindrome) {
            System.out.println("Your number is a Palindrome.");
        } else {
            System.out.println("Your number is not a Palindrome.");
        }
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
