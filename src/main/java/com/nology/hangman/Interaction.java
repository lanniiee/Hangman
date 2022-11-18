package com.nology.hangman;

import java.util.Scanner;

public class Interaction {

    private char input;

    private Scanner scanner = new Scanner(System.in);

    public void runGame() {

        readCharInput();

    }


    protected char readCharInput() {
        printMessage("Enter your character:");

        while (true) {
            String userInput = scanner.next();
            char userInputClean = userInput.toUpperCase().charAt(0);


            if (userInput.length() > 1 ) {
                printMessage("Oops! Please enter only 1 character at a time.");
            } else {
                char input = userInputClean;
                System.out.println(input);
                return this.input = input;
            }
        }
    }

    protected void printMessage(String message) {
        System.out.println(message);
    }





}
