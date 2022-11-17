package com.nology.hangman;

import java.util.Random;

public class WordSelector {

    private String word;
    private static final Random rand = new Random();

    public String generateWord() {
        word = Words.words.get(rand.nextInt(Words.words.size()));
        return word;
    }

}
