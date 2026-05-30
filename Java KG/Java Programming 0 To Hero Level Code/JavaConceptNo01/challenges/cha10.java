//package JavaConceptNo01.challenges;
// Here is a Java program to calculate the perimeter of a rectangle:
import java.util.Scanner; // Import Scanner class for user input

public class cha10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Taking input for length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble(); // Read length

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble(); // Read width

        // Calculating the perimeter (Perimeter = a + b + c + d)
        double perimeter = length + width + length + width; // Since opposite sides are equal

        // Displaying the result
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        scanner.close(); // Close the scanner
    }
}
