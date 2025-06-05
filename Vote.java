import java.util.Scanner; // Import the Scanner class to read user input

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console

        System.out.print("Please enter your age: "); // Prompt the user to enter their age
        int age = scanner.nextInt(); // Read the integer input from the user

        // Check if the age is 18 or greater
        if (age >= 18) {
            System.out.println("You are " + age + " years old. You are eligible to vote!");
        } else {
            // Calculate how many years until they can vote
            int yearsUntilVote = 18 - age;
            System.out.println("You are " + age + " years old. You are NOT eligible to vote yet.");
            System.out.println("You will be eligible to vote in " + yearsUntilVote + " years.");
        }

        scanner.close(); // Close the scanner to release system resources
    }
}