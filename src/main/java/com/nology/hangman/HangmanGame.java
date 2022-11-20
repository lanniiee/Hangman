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

        while (true) {
            word.runGame(command.readCharInput());
        }
    }

}
