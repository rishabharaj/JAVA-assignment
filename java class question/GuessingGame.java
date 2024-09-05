import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Generate random guesses for Player A and Player B
        int guessA = random.nextInt(100) + 1; // Random number between 1 and 100
        int guessB = random.nextInt(100) + 1; // Random number between 1 and 100

        // Display the guesses
        System.out.println("Player A guessed: " + guessA);
        System.out.println("Player B guessed: " + guessB);

        // Determine and declare the winner
        if (guessA > guessB) {
            System.out.println("Player A wins with a greater guess of " + guessA + "!");
        } else if (guessB > guessA) {
            System.out.println("Player B wins with a greater guess of " + guessB + "!");
        } else {
            System.out.println("It's a tie! Both players guessed the same number: " + guessA);
        }
    }
}