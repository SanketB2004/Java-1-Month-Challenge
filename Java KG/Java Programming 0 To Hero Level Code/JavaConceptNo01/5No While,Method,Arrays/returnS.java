import java.util.Scanner;

public class returnS {
    public static void main(String[] args) {
        
   
   greet();

   int first = readNumber();
   int second = readNumber();

   int sum = first + second;

   System.out.println("Sum "+sum);

   
   

   
   

    }

public static void greet(){
System.out.println("Welcome To Calculator\n");
}

public static int readNumber() {
    Scanner input =new Scanner(System.in);
System.out.println("Please enter the number : ");
int num1 = input.nextInt();

return num1 ; 
}

}
