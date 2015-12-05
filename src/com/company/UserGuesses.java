package com.company;

import java.util.Random;
import java.util.Scanner;

public class UserGuesses {

    public static void main(String[] args) {
    int userNumber = setRandomNumber();
    userGuessesNumber(computerGeneratesNumber(userNumber));
    }

    // get random number
    public static int setRandomNumber(){
        int randomNumber = 0;
        return randomNumber;
    }

    // generate random number from 1 to 100
    public static int computerGeneratesNumber(int variable){
        System.out.println("Computer generated  number from 1 to 100");
        Random number = new Random();
        int randomNumber = number.nextInt(100);
        System.out.println(randomNumber);
            //correction for negative numbers
            if(randomNumber < 0){
                variable =  -1 * randomNumber;
            } else {
                variable = randomNumber;
            }
        return variable;
    }
    // user guesses the number
    public static void userGuessesNumber(int variable){
        int userGuess;

        System.out.println("Guess and enter number from 1 to 100");
        do {
            Scanner input = new Scanner(System.in);
            userGuess = input.nextInt();

            if(userGuess == variable){
                System.out.println("You guessed CORRECT");
                variable = userGuess;
            }
            if (userGuess < variable){
                System.out.println("Your number: " + userGuess + " is less that one computer generated");
            } if (userGuess > variable) {
                System.out.println("Your number: " + userGuess + " is bigger that one computer generated");
            }
        } while (userGuess != variable);
    }
}