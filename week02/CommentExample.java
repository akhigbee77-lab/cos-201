/*
 * File:    CommentExample.java
 * Course:  COS 201 - Computer Programming I
 * Week 2:  Development Environment and First Java Program
 * Student: Akhigbe Emmanuel (25/16429)
 *
 * Shows the three kinds of comments in Java. The compiler ignores comments,
 * so they only help people read the code.
 */

/**
 * A documentation (Javadoc) comment starts with slash-star-star. It
 * describes a class or method, and the javadoc tool can turn it into
 * web pages.
 */
public class CommentExample {

    /**
     * The main method, where the program starts.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // A single-line comment starts with two slashes.
        System.out.println("Single-line comments start with //");

        /*
         * A multi-line comment starts with slash-star and ends with
         * star-slash. It can cover as many lines as needed.
         */
        System.out.println("Multi-line comments go between /* and */");

        System.out.println("Javadoc comments start with /**");

        // Turning a line into a comment stops it from running:
        // System.out.println("This line does not print.");

        System.out.println("Comments are ignored by the compiler."); // a comment can end a line too

    }
}
