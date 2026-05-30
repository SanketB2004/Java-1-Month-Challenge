package JavaConceptNo01.challenges;
import java.util.Scanner;

public class cha37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();
        
        int original = num, sum = 0, digits = String.valueOf(num).length();
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        if (sum == original) {
            System.out.println("Armstrong Number!");
        } else {
            System.out.println("Not an Armstrong Number!");
        }
    }
}
