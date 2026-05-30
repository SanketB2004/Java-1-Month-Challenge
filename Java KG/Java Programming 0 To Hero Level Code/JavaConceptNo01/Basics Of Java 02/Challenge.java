// This program displays a "Good Morning" message and three different patterns.
public class Challenge {

    public static void main(String[] args) {

        // 1) Display Good Morning message
        System.out.println("Good Morning");
        System.out.println(); // Blank line for clarity

        // 2) Display three different patterns

        // Pattern 1: Increasing Triangle
        System.out.println("Pattern 1:");
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
        System.out.println(); // Blank line for separation

        // Pattern 2: Decreasing Triangle
        System.out.println("Pattern 2:");
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
        System.out.println(); // Blank line for separation

        // Pattern 3: Right-aligned Triangle (Pyramid)
        System.out.println("Pattern 3:");
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
}
