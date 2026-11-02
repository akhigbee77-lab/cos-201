import java.util.Scanner;

/*
 * File:    SimpleCalculator.java
 * Course:  COS 201 - Computer Programming I
 * Week 3:  Variables, Data Types, Expressions and Input/Output
 * Student: Akhigbe Emmanuel (25/16429)
 *
 * Reads two numbers and displays their sum, difference, product, quotient
 * and remainder. The divisor is checked before dividing, because dividing
 * by zero has no answer.
 */
public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--- SIMPLE CALCULATOR ---");

        // hasNextDouble() checks that a number was typed before reading it,
        // so typing text gives a message instead of a crash.
        System.out.print("Enter the first number: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.close();
            return;
        }
        double secondNumber = input.nextDouble();

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        System.out.println("\n--- RESULTS ---");
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            double remainder = firstNumber % secondNumber;
            System.out.printf("Quotient: %.2f%n", quotient);
            System.out.printf("Remainder: %.2f%n", remainder);
        } else {
            System.out.println("Quotient: Division is undefined for a zero divisor.");
            System.out.println("Remainder: Division is undefined for a zero divisor.");
        }

        input.close();
    }
}
