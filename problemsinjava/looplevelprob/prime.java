
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        table();
    }

    public static void table() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter A Number to check Prime or Not:");
        int a = input.nextInt();

        System.out.println("Your Number is: " + a);

        boolean prime = true;

        if (a <= 1) {
            prime = false;
        }

        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("Number Is Prime");
        } else {
            System.out.println("Number Is Not Prime");
        }
    }
}
