package collegewallah;

public class loops1 {
    public static void main(String[] args) {
        
       int num = 1236 ;
       int numberodDigit=0;

       while (num>0) {
        num = num/10;
        numberodDigit++;
       }
       System.out.println(numberodDigit);
    }
}
