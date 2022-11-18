package com.nology.hangman;

import java.util.ArrayList;

public class WordDisplay {

    private final ArrayList<Character> guess = new ArrayList<>();
    private ArrayList<Integer> position = new ArrayList<>();
    private int lives = 5;
    private String word;
    Interaction input = new Interaction();
    WordSelector wordSelected = new WordSelector();

    public void displayWord() {
        word = wordSelected.generateWord();
        System.out.println(word);
    }

    public void displayGuess() {
        for (int i = 0; i < word.length(); i++) {
            guess.add('_');
        }
        System.out.println(guess);
    }

    public void updateChar() {
        for (int i = 0; i < word.length(); i++) {
            if (input.equals(word.charAt(i))) {
                position.add(i);
            }
        }
    }



}
