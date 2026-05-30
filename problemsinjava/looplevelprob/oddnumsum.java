import java.util.Scanner;

public class oddnumsum {
    public static void main(String[] args) {
        table();

    }
    public static void table(){
Scanner input = new Scanner(System.in);

        System.out.println("Enter A Number of a give a odd number sum formatally :" );
        int a = input.nextInt();
        System.out.println("your number is a :" +a);
int sum = 0;
        for (int i = 1; i <= a ; i+=2) {
            
sum = sum+i;

            
            
            

        }
System.out.println(sum+" = " +sum);
    }
}
