package com.nology.hangman;

public class HangmanGame {

    protected static void intro() {
        System.out.println("Welcome to hangman!");
    }

    public static void main(String[] args) {

        intro();

        WordDisplay word = new WordDisplay();
        word.displayWord();
        word.displayGuess();

        Interaction command = new Interaction();
        command.runGame();
    }

}
