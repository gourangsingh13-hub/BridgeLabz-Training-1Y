import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";

        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWin = 0, compWin = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();
            String comp = computerChoice();

            String winner = findWinner(user, comp);

            if (winner.equals("User")) userWin++;
            if (winner.equals("Computer")) compWin++;

            System.out.println("Computer: " + comp + " | Winner: " + winner);
        }

        System.out.println("\nResults:");
        System.out.println("User Wins: " + userWin);
        System.out.println("Computer Wins: " + compWin);
        System.out.println("User Win %: " + (userWin * 100.0 / n));
        System.out.println("Computer Win %: " + (compWin * 100.0 / n));
    }
}
