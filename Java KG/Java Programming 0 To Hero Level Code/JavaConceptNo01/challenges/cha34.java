package JavaConceptNo01.challenges;
import java.util.Scanner;
public class cha34 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
    
        System.out.println("Welcome To Number System : ");
    
        System.out.println("Please Enter Your Number : ");
    
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
    
        if (isPrime) {
            System.out.println("Your No Is Prime");
        } else {
            System.out.println("Your No Is Not Primr");
        }
    
    
    
        
       
        
    
    
    
      }
     public static boolean isPrime(int num){
    
        int i = 2;
        while (i < num) {
            if (num % i ==0) {
                return false ;
    
                
            }
            i++;
        }
       return true ;
     }
    }