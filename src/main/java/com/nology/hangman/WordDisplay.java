package com.nology.hangman;

public class WordDisplay {

    private String guess = "";
    private int lives = 5;
    private String word;

    WordSelector wordSelected = new WordSelector();

    public void displayWord() {
        word = wordSelected.generateWord();
        System.out.println(word);
    }

    public void displayGuess() {
        for (int i = 0; i < word.length(); i++) {
            guess += "_ ";
        }
        System.out.println(guess);
    }


}
