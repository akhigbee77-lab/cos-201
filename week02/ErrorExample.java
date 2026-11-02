/*
 * File:    ErrorExample.java
 * Course:  COS 201 - Computer Programming I
 * Week 2:  Development Environment and First Java Program
 * Student: Akhigbe Emmanuel (25/16429)
 *
 * The CORRECTED version of a program I first wrote with four deliberate
 * mistakes, to practise reading compiler errors.
 *
 * Original code (with errors):
 *
 *   1  public class ErrorExample {
 *   2      public static void main(String[] args) {
 *   3          System.out.println("COS 201 Error Practice")
 *   4          System.out.printn("Name: Akhigbe Emmanuel");
 *   5          System.out.println("Programme: Computer Science);
 *   6          int score = "75";
 *   7      }
 *   8  }
 *
 * First compile (javac ErrorExample.java) gave 2 errors:
 *   Line 3: error: ';' expected
 *           Fix: added the semicolon at the end of the statement.
 *   Line 5: error: unclosed string literal
 *           Fix: added the closing double quote.
 *
 * Second compile gave 2 more errors:
 *   Line 4: error: cannot find symbol (method printn)
 *           Fix: corrected the spelling to println.
 *   Line 6: error: incompatible types: String cannot be converted to int
 *           Fix: removed the quotes, because 75 is a number, not text.
 *
 * Lesson: javac reports syntax errors (punctuation) first. Spelling and
 * type errors only show up once the syntax is correct, so fix the errors,
 * compile again and repeat until it compiles.
 */
public class ErrorExample {

    public static void main(String[] args) {

        System.out.println("COS 201 Error Practice");
        System.out.println("Name: Akhigbe Emmanuel");
        System.out.println("Programme: Computer Science");
        int score = 75;
        System.out.println("Score: " + score);

    }
}
