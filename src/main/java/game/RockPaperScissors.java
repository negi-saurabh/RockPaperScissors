package game;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
        System.out.println(Constants.WELCOME_MSG);
        // starting the game
        rps.startGame();
        System.out.println(Constants.GOODBYE_MSG);
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "N";
        // need to run it first time without prompt for a new game
        do {
            System.out.println(Constants.DASH_SEPERATOR);
            playGame(scanner);
            System.out.println(Constants.SPACE);
            // getting user input, if they want to play again
            System.out.println(Constants.PLAY_AGAIN);
            playAgain = scanner.nextLine();
        } while (playAgain.toUpperCase().equals("Y"));
    }

    public void playGame(Scanner scanner) {
        // getting user's choice
        Choices playerChoice = new Player(scanner).getChoice();
        // generating computer's choice
        Choices computerChoice = new Computer().getChoice();
        System.out.println(Constants.COMPUTERS_CHOICE + computerChoice);
        // printing results
        if (playerChoice.equals(computerChoice)) {
            System.out.println(Constants.DRAW);
        } else if (winner(playerChoice, computerChoice)) {
            System.out.println(Constants.YOU_WON);
        } else {
            System.out.println(Constants.YOU_LOST);
        }
    }

    public boolean winner(Choices playerChoice, Choices computerChoice) {
        // game's logic
        if (playerChoice.equals(Choices.ROCK)) {
            return computerChoice.equals(Choices.SCISSORS);
        } else if (playerChoice.equals(Choices.PAPER)) {
            return computerChoice.equals(Choices.ROCK);
        } else {
            return computerChoice.equals(Choices.PAPER);
        }
    }
}
