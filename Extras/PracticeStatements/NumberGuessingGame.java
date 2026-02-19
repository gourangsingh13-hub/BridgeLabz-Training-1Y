import java.util.Scanner;

public class NumberGuessingGame {

    public static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    public static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.nextLine().toLowerCase();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;

        System.out.println("Think of a number between 1 and 100.");

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("Yay! Computer guessed correctly.");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}
