package com.nology.hangman;

import java.util.Scanner;

public class Interaction {

    private int input;

    protected char readCharInput(int lives) {

        while (lives > 0) {
            printMessage("Enter your character:");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();
            char userInputClean = userInput.toLowerCase().charAt(0);

            if (userInput.length() > 1 ) {
                printMessage("Oops! Please enter only 1 character at a time.");
            } else {
                char input = userInputClean;
                return input;
            }
        }
        return (char) input;
    }

    protected void printMessage(String message) {
        System.out.println(message);
    }





}
