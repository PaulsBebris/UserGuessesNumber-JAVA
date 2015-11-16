package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

    computerGeneratesNumber();
    userGuessesNumber();

    }

    // generate random number from 1 to 100
    public static int computerGeneratesNumber(){
        System.out.println("Computer generated  number from 1 to 100");
        Random number = new Random();
        int randomNumber = number.nextInt(100);
//        System.out.println(randomNumber);
            //correction for negative numbers
            if(randomNumber < 0){
                randomNumber = randomNumber * (-1);
            }
        return randomNumber;
    }
    // user guesses the number
    public static int userGuessesNumber(){
        System.out.println("Guess and enter number from 1 to 100");
        Scanner input = new Scanner(System.in);
        int userGuess = input.nextInt();
        if(){

        }
        System.out.println(userGuess);
        return userGuess;
    }
}
