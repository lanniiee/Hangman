package com.nology.hangman;

public class HangmanGame {

    protected static void intro() {
        System.out.println("Welcome to hangman!");
    }

    public static void main(String[] args) {

        intro();

        Interaction command = new Interaction();
        WordDisplay word = new WordDisplay();
        word.displayWord();
        word.displayGuess();

        while (word.getLives() > 0) {
            if (word.isGameStart()) {
                word.runGame(command.readCharInput());
            } else {
                word.setLives(0);
                System.out.println("Congrats! You got it correct!");
            }
        }
    }
}
