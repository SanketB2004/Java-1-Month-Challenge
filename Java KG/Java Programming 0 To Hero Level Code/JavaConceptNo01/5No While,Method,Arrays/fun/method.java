// //package JavaConceptNo01.5No While,Method,Arrays.fun;

// public class method {
//     public static void main(String[] args) {
//        System.out.println("In main method");

//        greeting();

//        System.out.println("Method Calling Complete");
// System.out.println();

// starpattern();
//     }

//     public static void starpattern(){

//         int a = 0;

//         while (a < 5) {
//             System.out.print("*");

//            int b = 0 ;
//            while (b < a) {
//             System.out.print(" *");
//             b++;

//            }
//            System.out.println();
//            a++; 
//         }

//     }

//     public static void greeting(){

//         System.out.println("Good Morning");
//     }

// }

public class method {

    public static void main(String[] args) {

        starpattern();

    }

    public static void starpattern() {

        int row = 0;

        while (row < 5 ) {

            System.out.println(" *");
        

            row++;

        }

    }
}
