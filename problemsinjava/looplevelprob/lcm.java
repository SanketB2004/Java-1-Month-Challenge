import java.util.Scanner;

public class lcm {

    public static void main(String[] args) {
        table();
    }

    public static void table() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = input.nextInt();

        System.out.print("Enter Second Number: ");
        int b = input.nextInt();

        int i = 1;

        while (true) {

            int fact = a * i;

            if (fact % b == 0) {
                System.out.println("LCM = " + fact);
                break;
            }

            i++;
        }
    }
}