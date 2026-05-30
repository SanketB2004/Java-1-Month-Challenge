package JavaConceptNo01.operators_if_else_number04;



public class UnaryOperators {

    public static void main(String[] args) {

        // Example 1: Post-increment (x++)
        int x = 5;
        int d = x++;  // Assign x to d, then increment x by 1
        int f = d;
        System.out.println("Post-increment example:");
        System.out.println("d (before increment): " + d); // d gets the original value of x (5)
        System.out.println("x (after increment): " + x);  // x becomes 6
        System.out.println();

        // Example 2: Pre-increment (++k)
        int k = 88;
        System.out.println("Pre-increment example:");
        System.out.println("++k (increment first, then print): " + ++k);  // k becomes 89 and prints 89
        System.out.println();

        // Example 3: Post-increment (l++)
        int l = 90;
        System.out.println("Post-increment example:");
        System.out.println("l++ (print first, then increment): " + l++);  // Prints 90, then l becomes 91
        System.out.println("l (after post-increment): " + l);              // Now l is 91
        System.out.println();

        // Example 4: Pre-decrement and Post-decrement
        int m = 10;
        System.out.println("Pre-decrement and Post-decrement example:");
        System.out.println("--m (decrement first, then print): " + --m);  // m becomes 9, then prints 9
        System.out.println("m-- (print first, then decrement): " + m--);  // Prints 9, then m becomes 8
        System.out.println("m (after post-decrement): " + m);             // Now m is 8

    }
}

