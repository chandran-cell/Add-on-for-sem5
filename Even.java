// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner; // Import the Scanner class for user input

public class PrintEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

        System.out.print("Enter a positive integer limit: "); // Prompt the user
        int limit = scanner.nextInt(); // Read the integer limit from the user

        System.out.println("Even numbers up to " + limit + " are:");

        // --- Method 1: Using a for loop and an if condition ---
        // This method iterates through all numbers up to the limit
        // and checks if each number is even.
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) { // The modulo operator (%) returns the remainder of a division.
                              // If a number divided by 2 has a remainder of 0, it's even.
                System.out.println(i);
            }
        }

        /*
        // --- Method 2: Using a for loop and incrementing by 2 (more efficient) ---
        // This method directly generates even numbers, avoiding the if check inside the loop.
        // It's generally more efficient for this specific task.

        // Start from 2 (the first even number)
        for (int i = 2; i <= limit; i += 2) {
            System.out.println(i);
        }
        */

        scanner.close(); // Close the scanner to release system resources
    }
}