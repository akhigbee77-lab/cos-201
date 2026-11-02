import java.util.Scanner;

/*
 * File:    ItemCost.java
 * Course:  COS 201 - Computer Programming I
 * Week 3:  Variables, Data Types, Expressions and Input/Output
 * Student: Akhigbe Emmanuel (25/16429)
 *
 * Reads an item name, quantity and unit price, then prints a purchase
 * summary with the total cost in Naira. A quantity below 1 and a negative
 * price are rejected.
 */
public class ItemCost {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--- ITEM COST ---");

        System.out.print("Enter item name: ");
        String itemName = input.nextLine().trim();
        if (itemName.isEmpty()) {
            System.out.println("Invalid input. Item name cannot be empty.");
            input.close();
            return;
        }

        // Quantity is an int because you cannot buy part of an item.
        System.out.print("Enter quantity: ");
        if (!input.hasNextInt()) {
            System.out.println("Invalid input. Quantity must be a whole number.");
            input.close();
            return;
        }
        int quantity = input.nextInt();
        if (quantity < 1) {
            System.out.println("Invalid quantity. Quantity must be at least 1.");
            input.close();
            return;
        }

        System.out.print("Enter unit price (NGN): ");
        if (!input.hasNextDouble()) {
            System.out.println("Invalid input. Unit price must be a number.");
            input.close();
            return;
        }
        double unitPrice = input.nextDouble();
        if (unitPrice < 0) {
            System.out.println("Invalid price. Unit price cannot be negative.");
            input.close();
            return;
        }

        // int * double gives a double, so the kobo part is kept.
        double totalCost = quantity * unitPrice;

        // %,.2f shows 2 decimal places with commas, e.g. 4,200.00
        System.out.println("\n--- PURCHASE SUMMARY ---");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit price: NGN %,.2f%n", unitPrice);
        System.out.printf("Total cost: NGN %,.2f%n", totalCost);

        input.close();
    }
}
