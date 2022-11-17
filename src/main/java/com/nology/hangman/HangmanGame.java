package com.nology.hangman;

public class HangmanGame {


    public static void main(String[] args) {

        WordSelector wordSelected = new WordSelector();
        System.out.println(wordSelected.generateWord());

    }

}
