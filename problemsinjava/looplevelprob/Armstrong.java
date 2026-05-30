import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to check Armstrong:");
        int num = input.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
    
