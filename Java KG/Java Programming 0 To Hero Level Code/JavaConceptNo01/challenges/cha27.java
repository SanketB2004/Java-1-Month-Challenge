//package JavaConceptNo01.challenges;

// write a program to check if ano even or odd use bitwice operator : 

import java.util.Scanner;



public class cha27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Checking even or odd using only right shift
        // if ((num >> 1) << 1 == num) {  
        //     System.out.println(num + " is Even.");
        // } else {
        //     System.out.println(num + " is Odd.");
        // }
        // if ((num & 1 )== 1) {  
        //     System.out.println(num + " is Even.");
        // } else {
        //     System.out.println(num + " is Odd.");
        // }
        if ((num | 1 ) == num) {  
            System.out.println(num + " is Odd.");
        } else {
            System.out.println(num + " is Even Sanku Bhaii.");
        }


        scanner.close();
    }
}
