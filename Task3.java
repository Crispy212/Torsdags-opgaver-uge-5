import java.util.Random;
import java.util.Scanner;

public class Task3 {
    private static int rnd_number;

    public static void main(String[] args) {
        // Pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        // Read user input
        String input = scan.nextLine();

        // Check if the input is numeric
        if (input.matches("\\d+")) {
            int guess = Integer.parseInt(input);
            // Compare the guess with the random number
            if (guess == rnd_number) {
                System.out.println("Congratulations! You guessed the number!");
            } else if (guess < rnd_number) {
                System.out.println("Your guess is too low. Try again.");
                makeAGuess(); // Allow the user to make another guess
            } else {
                System.out.println("Your guess is too high. Try again.");
                makeAGuess(); // Allow the user to make another guess
            }
        } else {
            System.out.println("Error: Please enter a numeric value.");
            makeAGuess(); // Show error message and allow the user to try again
        }
    }
}