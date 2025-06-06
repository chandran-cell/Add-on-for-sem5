

import java.util.Scanner;

public class PrintEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a positive integer limit: ");
        int limit = scanner.nextInt(); 

        System.out.println("Even numbers up to " + limit + " are:");

      
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) { 
                System.out.println(i);
            }
        }

       
        scanner.close(); 
    }
}
