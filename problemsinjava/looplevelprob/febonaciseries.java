import java.util.Scanner;

public class febonaciseries {

    public static void main(String[] args) {
        table();
    }

    public static void table() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Terms: ");
        int a = input.nextInt();

        int first = 0;
        int second = 1;

        int i = 1;

        while (i <= a) {

            System.out.print(first + " ");

            int third = first + second;
            first = second;
            second = third;

            i++;
        }
    }
}