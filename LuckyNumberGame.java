package day7;

import java.util.Scanner;

public class LuckyNumberGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("🎮 Welcome to the Lucky Number Game!");
        System.out.print("Enter a number between 1 and 5: ");
        int guess = scanner.nextInt();

        int luckyNumber = 4;

        if (guess == 1) {
            if (guess == luckyNumber) {
                System.out.println("🎉 Congratulations! You guessed the lucky number!");
            } else {
                System.out.println("❌ Sorry, that's not the lucky number.");
            }
        } else if (guess == 2) {
            if (guess == luckyNumber) {
                System.out.println("🎉 Congratulations! You guessed the lucky number!");
            } else {
                System.out.println("❌ Sorry, that's not the lucky number.");
            }
        } else if (guess == 3) {
            if (guess == luckyNumber) {
                System.out.println("🎉 Congratulations! You guessed the lucky number!");
            } else {
                System.out.println("❌ Sorry, that's not the lucky number.");
            }
        } else if (guess == 4) {
            if (guess == luckyNumber) {
                System.out.println("🎉 Congratulations! You guessed the lucky number!");
            } else {
                System.out.println("❌ Sorry, that's not the lucky number.");
            }
        } else if (guess == 5) {
            if (guess == luckyNumber) {
                System.out.println("🎉 Congratulations! You guessed the lucky number!");
            } else {
                System.out.println("❌ Sorry, that's not the lucky number.");
            }
        } else {
            System.out.println("⚠️ Invalid input! Please enter a number between 1 and 5.");
        }

        scanner.close();
    }
}

