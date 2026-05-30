import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 3.1 Variable Example
        int age = 55;
        System.out.println("Age: " + age);
        int ae = 564;
        // 3.2 Data Types
        int myNumber = 55;
        System.out.println("int: " + myNumber);

        byte myByte = 55;
        System.out.println("byte: " + myByte);

        short myShort = 55;
        System.out.println("short: " + myShort);

        long myLong = 55L;
        System.out.println("long: " + myLong);

        float myFloat = 5.55f;
        System.out.println("float: " + myFloat);

        double myDouble = 55555.5d;
        System.out.println("double: " + myDouble);

        String myString = "Hello";
        System.out.println("String: " + myString);

        // 3.3 Naming Convention Example
        int studentAge = 20;
        System.out.println("Student Age: " + studentAge);

        // 3.4 Literal Example
        float myLiteral = 555555.55f;
        System.out.println("Float Literal: " + myLiteral);

        // 3.6 Escape Sequence Example
        System.out.println("*\n**\n***\n****\n*****\n");
        System.out.println("*****\n****\n***\n**\n*");
        System.out.println("    *\n   **\n  ***\n ****\n*****");

        // 3.7 User Input Example
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        int na = sc.nextInt();
        System.out.println("Hey, " + name + "! Welcome to Hacker Room.");

        // Password Example
        System.out.println("Enter the file password:");
        String password = input.nextLine();
        System.out.println("Password entered: " + password);

        // 3.8 Type Conversion and Casting
        float myFloatConversion = 12.8f;
        System.out.println("Implicit Conversion (long to float): " + myFloatConversion);

        float myIntCast = (int) 232;
        System.out.println("Explicit Casting (float to int): " + myIntCast);


        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println("Next Int");
        }

        input.close();
    }
}
