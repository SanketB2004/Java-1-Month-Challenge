import java.util.Scanner;

public class factonum {
   public static void main(String[] args) {
        table();
   }

   public static void table(){
Scanner input = new Scanner(System.in);

        System.out.println("Enter A Number of a factorial formatally :" );
        int a = input.nextInt();
        System.out.println("your number is a :" +a);
int sum = 1;
        for (int i = 1; i <= a ; i++) {
            
sum*=i;
        }
System.out.println(sum+" = " +sum);
}
}