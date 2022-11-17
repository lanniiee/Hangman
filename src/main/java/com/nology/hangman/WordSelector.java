package com.nology.hangman;

import java.util.Random;

public class WordSelector {

    protected Words word;

    public Words getWord() {
        return word;
    }

    public void setWord() {
        this.word = word;
    }

    private static final Random rand = new Random();

    public String generateWord() {
        return Words.words.get(rand.nextInt(Words.words.size()));
    }


}
