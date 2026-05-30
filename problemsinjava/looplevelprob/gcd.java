
    import java.util.Scanner;

public class gcd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        int gcd = 1;
        int i = 1;

        while (i <= least(num1, num2)) {

            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }

            i++;
        }

        System.out.println("GCD = " + gcd);
    }

    public static int least(int num1, int num2) {

        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}