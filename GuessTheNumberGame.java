import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int maxAttempts = 10; // You can change this to set a different limit.
        int score = 0;
        int attempts = 0;

        System.out.println("Welcome to Guess the Number game!");
        System.out.println("I've selected a random number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                score += maxAttempts - attempts + 1; // Award points based on remaining attempts.
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }

            if (attempts < maxAttempts) {
                System.out.println("Attempts left: " + (maxAttempts - attempts));
            } else {
                System.out.println("You've run out of attempts. The correct number was: " + randomNumber);
            }
        }

        System.out.println("Your final score: " + score);
        scanner.close();
    }
}
