package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int randomNumber = 0;
    private static int userGuess = 0;


    public static void main(String[] args) {

    computerGeneratesNumber();
    userGuessesNumber();

    }

    // generate random number from 1 to 100
    public static int computerGeneratesNumber(){
        System.out.println("Computer generated  number from 1 to 100");
        Random number = new Random();
        int randomNumber = number.nextInt(100);
        System.out.println(randomNumber);
            //correction for negative numbers
            if(randomNumber < 0){
                Main.randomNumber =  -1 * randomNumber;
            } else {
                Main.randomNumber = randomNumber;
            }
        return Main.randomNumber;
    }
    // user guesses the number
    public static int userGuessesNumber(){
        System.out.println("Guess and enter number from 1 to 100");
        Scanner input = new Scanner(System.in);
        int userGuess = input.nextInt();
//        Main.userGuess = userGuess;

        if(userGuess == Main.randomNumber){
            System.out.println("You guessed CORRECT");
            Main.userGuess = userGuess;
        } if (userGuess < Main.randomNumber){
            System.out.println("Your number: " + userGuess + " is less that one computer generated");
            Main.userGuess = userGuess;
        } if (userGuess > Main.randomNumber) {
            System.out.println("Your number: " + userGuess + " is bigger that one computer generated");
            Main.userGuess = userGuess;
        }
//        System.out.println(userGuess);

        return Main.userGuess;
    }
}
