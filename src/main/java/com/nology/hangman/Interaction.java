package com.nology.hangman;

import java.util.Scanner;

public class Interaction {

    private char input;

    private Scanner scanner = new Scanner(System.in);


    protected char readCharInput() {
        printMessage("Enter your character:");

        while (true) {
            String userInput = scanner.next();
            char userInputClean = userInput.toLowerCase().charAt(0);

            if (userInput.length() > 1 ) {
                printMessage("Oops! Please enter only 1 character at a time.");
            } else {
                char input = userInputClean;
                return input;
            }
        }
    }

    protected void printMessage(String message) {
        System.out.println(message);
    }





}
