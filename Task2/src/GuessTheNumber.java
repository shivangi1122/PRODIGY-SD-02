import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfAttempts = 0;
        int userGuess;
        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it.");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfAttempts++;
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("The number was: " + numberToGuess);
                System.out.println("It took you " + numberOfAttempts + " attempts to win.");
            }
        } while (userGuess != numberToGuess);
        scanner.close();
    }
}
