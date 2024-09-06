import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};
        int userChoice;
        int computerChoice;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.println("Choose your move: (0: Rock, 1: Paper, 2: Scissors)");
            userChoice = scanner.nextInt();

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please enter a valid option (0, 1, or 2).");
                continue;
            }

            computerChoice = random.nextInt(3);

            System.out.println("You chose: " + options[userChoice]);
            System.out.println("Computer chose: " + options[computerChoice]);

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0) || (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.println("Play again? (Y/N)");
            String playAgain = scanner.next();

            if (playAgain.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}