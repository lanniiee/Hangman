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
            word.runGame(command.readCharInput(word.getLives()));
        }
    }

}
