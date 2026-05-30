package JavaConceptNo01.challenges;
// Here is a Java program to calculate the area of a triangle using the formula:
import java.util.Scanner; // Import Scanner class for user input

public class cha11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Taking input for base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble(); // Read base

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble(); // Read height

        // Calculating the area of the triangle (Area = 1/2 * base * height)
        double area = 0.5 * base * height;

        // Displaying the result
        System.out.println("The area of the triangle is: " + area);

        scanner.close(); // Close the scanner
    }
}
