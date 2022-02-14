package imc.homeassignment;

import java.util.Scanner;

public class Player implements Options {

    private Scanner scanner;

    public Player(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Choices getChoice() {
        // Asking user for their choice,
        System.out.println(Constants.CHOICE_TO_ENTER);
        String userInput = scanner.nextLine();

        // making it case-insensitive, so that user can enter letters in any case
        userInput = userInput.toLowerCase();
        switch (userInput) {
            case Constants.ROCK:
                return Choices.ROCK;
            case Constants.PAPER:
                return Choices.PAPER;
            case Constants.SCISSORS:
                return Choices.SCISSORS;
        }

        // if user enters a wrong choice we need to prompt again
        System.out.println(Constants.WRONG_CHOICE_MSG);
        return getChoice();
    }
}
