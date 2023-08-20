import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
       
        int maxAttempts = 10;
        int rounds = 0;
        int wins = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        while (true) {
            int targetNumber = random.nextInt(100)+1;
            System.out.printf("Round %d\n", ++rounds);
            System.out.printf("Guess the number between %d and %d.\n", 0, 100);
            
            int attempts = 0;
            boolean roundWon = false;
            
            while (attempts < maxAttempts) {
                System.out.printf("Attempt %d/%d: Enter your guess: ", attempts + 1, maxAttempts);
                int userGuess = scanner.nextInt();
                
                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try a lower number.");
                } else {
                    System.out.printf("Congratulations! You've guessed the number %d correctly in %d attempts.\n", targetNumber, attempts + 1);
                    roundWon = true;
                    wins++;
                    break;
                }
                
                attempts++;
            }
            
            if (!roundWon) {
                System.out.printf("Sorry, you've run out of attempts. The correct number was %d.\n", targetNumber);
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("no")) {
                break;
            }
        }
        
        System.out.println("\nGame over!");
        System.out.printf("You played %d round(s) and won %d round(s).\n", rounds, wins);
        
        scanner.close();
    }
}
