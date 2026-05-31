public class patternq {


    public static void main(String[] args) {
        
secondpattern(6);
    }

    public static void secondpattern(int a){

        for (int i = a; i >= 1 ; i--) {
            


for (int j = 1; j <= i; j++) {

    System.out.print("* ");
}
 System.out.println(); // next line
        }

    }
    
}
