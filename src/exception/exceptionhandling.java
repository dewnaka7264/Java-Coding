package exception;

import java.util.Scanner;

public class exceptionhandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        int userInput = 0;

        while (!validInput) {
            try {
                System.out.println("Enter an integer:");
                userInput = scanner.nextInt();
                validInput = true;  // Set the flag to exit the loop if the input is valid
            } catch (java.util.InputMismatchException e) {
                System.out.println("InputMismatchException: Please enter a valid integer.");
                scanner.nextLine();  // Consume the invalid input to avoid an infinite loop
            }
        }

        System.out.println("You entered: " + userInput);
    }
}

