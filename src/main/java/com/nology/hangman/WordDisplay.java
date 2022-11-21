package com.nology.hangman;

import java.util.ArrayList;

public class WordDisplay {

    private final ArrayList<Character> guess = new ArrayList<>();
    private ArrayList<Character> wordAsArray = new ArrayList<>();
    private ArrayList<Character> charactersUserGuessed = new ArrayList<>();
    private String word;
    private char input;
    private int lives = 5;

    WordSelector wordSelected = new WordSelector();

    public void displayWord() {
        this.word = wordSelected.generateWord();
        System.out.println(word);
    }

    public void displayGuess() {
        for (int i = 0; i < word.length(); i++) {
            guess.add('_');
            wordAsArray.add(word.charAt(i));
        }
        System.out.println(guess);
    }

    public void showLives() {
        System.out.println("Number of lives remaining: " + this.lives);
    }

    public void handleLives(char input) {
        this.input = input;

        if (charactersUserGuessed.contains(input)) {
            System.out.println("You have already guessed this character! Try again");
        }
        else if(!wordAsArray.contains(input) && !charactersUserGuessed.contains(input)) {
            this.lives--;
            System.out.println("Unfortunately that is incorrect! You have lost one life. Try again.");
        } else if (wordAsArray.contains(input) && !charactersUserGuessed.contains(input)) {
            System.out.println("Well done! That character is in the word");
            charactersUserGuessed.add(input);
        }

        showLives();
    }

    public void updateChar(char input) {
        this.input = input;
        if (!charactersUserGuessed.contains(input)) {
            for (int i = 0; i < word.length(); i++) {
                if (input == word.charAt(i)) {
                    guess.set(i, input);
                }
            }
        }

        System.out.println(guess);
    }

    public void endGame () {
        if (this.lives == 0) {
            System.out.println("Game Over!");
        } else if (guess.equals(wordAsArray)) {
            System.out.println("Congrats! You guessed the word correctly!");

        }
    }

    public void runGame(char input) {
        if (this.lives > 0) {
            showLives();
            updateChar(input);
            handleLives(input);
            endGame();
        }
        if (lives == 0) {
            endGame();

        }
    }
}
