import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        table();
   }
   public static void table(){
Scanner input = new Scanner(System.in);

        System.out.println("Enter A Number of a sum of digit formatally :" );
        int a = input.nextInt();
        System.out.println("your number is a :" +a);
int sum = 0;
        while (a>0) {
            sum += a % 10;
             a/=10;


        }
System.out.println(sum+" = " +sum);
}
}
