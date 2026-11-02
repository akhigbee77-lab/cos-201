import java.util.Scanner;

/*
 * File:    AverageCalculator.java
 * Course:  COS 201 - Computer Programming I
 * Week 3:  Variables, Data Types, Expressions and Input/Output
 * Student: Akhigbe Emmanuel (25/16429)
 *
 * Reads a student's name and three course scores, then displays the total
 * and the average.
 *
 * Extension: each score must be between 0 and 100. A score outside that
 * range is rejected straight away, naming the course it was entered for.
 */
public class AverageCalculator {

    public static void main(String[] args) {

        // final makes these constants: their values cannot change.
        final int NUMBER_OF_COURSES = 3;
        final double MIN_SCORE = 0;
        final double MAX_SCORE = 100;

        Scanner input = new Scanner(System.in);

        System.out.println("--- AVERAGE CALCULATOR ---");

        // nextLine() reads the whole line, so a name with spaces works.
        System.out.print("Enter student name: ");
        String name = input.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Invalid input. Student name cannot be empty.");
            input.close();
            return;
        }

        System.out.print("Enter score for Course 1: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double score1 = input.nextDouble();
        if (score1 < MIN_SCORE || score1 > MAX_SCORE) {
            System.out.println("Invalid score for Course 1. Scores must be between 0 and 100.");
            input.close();
            return;
        }

        System.out.print("Enter score for Course 2: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double score2 = input.nextDouble();
        if (score2 < MIN_SCORE || score2 > MAX_SCORE) {
            System.out.println("Invalid score for Course 2. Scores must be between 0 and 100.");
            input.close();
            return;
        }

        System.out.print("Enter score for Course 3: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double score3 = input.nextDouble();
        if (score3 < MIN_SCORE || score3 > MAX_SCORE) {
            System.out.println("Invalid score for Course 3. Scores must be between 0 and 100.");
            input.close();
            return;
        }

        double total = score1 + score2 + score3;
        double average = total / NUMBER_OF_COURSES;

        System.out.println("\n--- STUDENT RESULT ---");
        System.out.println("Student: " + name);
        System.out.printf("Course 1: %.2f%n", score1);
        System.out.printf("Course 2: %.2f%n", score2);
        System.out.printf("Course 3: %.2f%n", score3);
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);

        input.close();
    }
}
