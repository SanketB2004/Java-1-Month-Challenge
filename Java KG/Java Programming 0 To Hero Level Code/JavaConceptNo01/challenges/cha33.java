
package JavaConceptNo01.challenges;

import java.util.Scanner;

public class cha33 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome To Number System : ");

    System.out.println("Please Enter Your Number : ");

    int first = input.nextInt();

    System.out.println("Please Enter Your Number : ");

    int second = input.nextInt();

    int gcd = gcd(first, second);
    System.out.println("GCD of the no is : " +gcd);

    

   }
 public static int gcd(int num1 , int num2){
    int gcd = 1;
    int i =2;
    int list =list(num1, num2);
    while (i <= list) {
          if (num1 % i == 0 && num2 % i ==0) {
            gcd = i ; 
          }

        i++;
        
    }

    return gcd;
 }
 public static int list(int num1 , int num2){
    if (num1 < num2) {
        return num1;
    }else{
        return num2;
    }
 }
}
