package com.nology.hangman;

import java.util.ArrayList;

public class WordDisplay {

    private final ArrayList<Character> guess = new ArrayList<>();
    private final ArrayList<Character> wordAsArray = new ArrayList<>();
    private final ArrayList<Character> charactersUserGuessed = new ArrayList<>();
    private String word;
    private char input;
    private int lives = 5;
    private boolean gameStart = true;

    WordSelector wordSelected = new WordSelector();

    public void displayWord() {
        this.word = wordSelected.generateWord();
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

        if (charactersUserGuessed.contains(input) && !guess.equals(wordAsArray)) {
            System.out.println("You have already guessed this character! Try again");
        }
        else if(!wordAsArray.contains(input) && !charactersUserGuessed.contains(input)) {
            this.lives--;
            System.out.println("Unfortunately that is incorrect!");
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
            this.gameStart = false;
        }
        if (guess.equals(wordAsArray)) {
            this.gameStart = false;
        }
    }

    public void runGame(char input) {
            showLives();
            updateChar(input);
            handleLives(input);
            endGame();
    }

    public int getLives() {
        return this.lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public boolean isGameStart() {
        return this.gameStart;
    }
}
