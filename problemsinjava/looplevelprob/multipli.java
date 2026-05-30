import java.util.Scanner;

public class multipli{
    public static void main(String[] args) {

        table();
        

    }

    public static void table(){
Scanner input = new Scanner(System.in);

        System.out.println("Enter A Number of a give a multiplication table you formatally :" );
        int a = input.nextInt();
        System.out.println("your number is a :" +a);

        for (int i = 0; i <= 10 ; i++) {
            
            
            System.out.println(a+" = " +i + " = " +a*i);

        }

    }
}