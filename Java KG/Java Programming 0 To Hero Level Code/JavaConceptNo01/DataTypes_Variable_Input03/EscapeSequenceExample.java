// package JavaConceptNo01.DataTypes_Variable_Input03;
public class EscapeSequenceExample {
    public static void main(String[] args) {

        // 1. Newline (\n): Moves to the next line
        System.out.println("Hello World!\nThis is a new line.");

        // 2. Tab (\t): Adds a horizontal tab space
        System.out.println("Name:\tSanket Bhosale");

        // 3. Backspace (\b): Removes the previous character
        System.out.println("Hello\b World!");  // Removes 'o' from Hello

        // 4. Carriage Return (\r): Moves cursor to the beginning of the line
        System.out.println("Good Morning\rHi!");  // Only "Hi!" will be shown

        // 5. Single Quote (\'): Prints single quotation mark
        System.out.println("I\'m learning Java!");

        // 6. Double Quote (\"): Prints double quotation mark
        System.out.println("She said, \"Java is fun!\"");

        // 7. Backslash (\\): Prints a backslash
        System.out.println("C:\\Users\\Sanket\\Documents");

        // 8. Form Feed (\f): Rarely used, moves to the next page (not visible in console output)
        System.out.println("Form Feed\fExample");

        
    }
}
