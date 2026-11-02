/*
 * File:    PrintExample.java
 * Course:  COS 201 - Computer Programming I
 * Week 2:  Development Environment and First Java Program
 * Student: Akhigbe Emmanuel (25/16429)
 *
 * Compares print() and println(), uses escape sequences and joins text
 * with the + operator.
 */
public class PrintExample {

    public static void main(String[] args) {

        // print() leaves the cursor on the same line.
        System.out.print("WEEK 2: ");
        System.out.print("Printing Output");
        System.out.println();   // moves to a new line

        // println() moves to a new line after printing.
        System.out.println("println() ends the line here.");
        System.out.println("This text is on the next line.");

        // Escape sequences
        System.out.println("COURSE:\tCOS 201");            // \t  tab
        System.out.println("LINE ONE\nLINE TWO");          // \n  new line
        System.out.println("She said \"Java is fun\".");   // \"  double quote
        System.out.println("FOLDER: C:\\cos-201\\week02"); // \\  backslash

        // Joining text with +
        String name = "Akhigbe Emmanuel";
        String programme = "Computer Science";
        System.out.println("NAME: " + name + " (" + programme + ")");
        System.out.println("10 + 5 = " + 10 + 5);    // joins: 105
        System.out.println("10 + 5 = " + (10 + 5));  // adds first: 15

    }
}
