package com.weekone.assignment;
import java.util.Scanner;

/**
 * user has 5 chances to guess a number that between 1 and 
 * user is successful if nuber guess is withen 10 numbers
 */
public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //number of chances
        int chances = 5;
        //if user guess is within 10 found become True
        boolean found = false;
        String userInput = "";
        boolean isValid = false;

        //random number between 1 and 100
        int randNum = (int) (Math.random() * 100 + 1) ;

        while(chances > 0 && !found) {
            //validates user input
            while(!isValid){
                userInput = scan.next();
                isValid = userInput.matches("-?\\d+");
            }
            int userval = Integer.parseInt(userInput);
            chances--;
            //check ig user input is within 10 of the random number
            if (userval >= randNum -10  && userval <= randNum + 10 )
                found = true;
            isValid = false;
        }

        //if found print success else print sorry
        if (found)
            System.out.println("Success :"+randNum);
        else
            System.out.println("Sorry :"+randNum);
        
        scan.close();
    }
}

