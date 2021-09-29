/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author igord
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Play();
    }
    
    public static void Play() {
        Scanner sc = new Scanner(System.in);
        Random rps = new Random();
        
        System.out.println("How many rounds (min 1 and max 10)?");
        String roundsNumberString = sc.nextLine();
        
        if (RoundsCheck(roundsNumberString)) {
            System.out.println("You chose to play " + roundsNumberString + " rounds.");
	} else {
            System.out.println("ERROR! Invalid entry or rounds number is out of bounds.");
            Play();
	}
        
        int roundsNumber = Integer.parseInt(roundsNumberString);
        int usrChoice;
        int pcChoice;
        int usrCounter = 0;
        int pcCounter = 0;
        int tiesCounter = 0;

        for (int roundNow = 1; roundNow <= roundsNumber; roundNow++) {
            System.out.println("Round " + roundNow);
            System.out.print("Choose a number: ");
            System.out.println("1 for Rock, 2 for Paper, or 3 for Scissors");
            String usrChoiceString = sc.nextLine();

            while ((!usrChoiceString.equals("1")) && (!usrChoiceString.equals("2")) && (!usrChoiceString.equals("3"))) {
                System.out.println("Invalid! Please enter a valid number: 1 for Rock, 2 for Paper, or 3 for Scissors");
                usrChoiceString = sc.nextLine();
            }

            usrChoice = Integer.parseInt(usrChoiceString);

            switch (usrChoice) {
                case 1:
                    System.out.println("You chose 'Rock'");
                    break;
                case 2:
                    System.out.println("You chose 'Paper'");
                    break;
                case 3:
                    System.out.println("You chose 'Scissors'");
                    break;
            }

            pcChoice = rps.nextInt(3)+1;
            if (pcChoice == 1) {
                System.out.println("Computer chose 'Rock'");
            }
            if (pcChoice == 2) {
                System.out.println("Computer chose 'Paper'");
            }
            if (pcChoice == 3) {
                System.out.println("Computer chose 'Scissors'");
            }

            if (usrChoice == pcChoice) {
                System.out.println("The computer chose the same as you, so no winner in this round.");
                tiesCounter++;
            } else if ((usrChoice==1 && pcChoice==3)||(usrChoice==2 && pcChoice==1)||(usrChoice==3 && pcChoice==2)) {
                System.out.println("You win this round.");
                usrCounter++;
            } else {
                System.out.println("You lost this round.");
                pcCounter++;
            }
            if (roundNow == roundsNumber) {
                System.out.println("The final score is: " );
            } else {
                System.out.println("The current score is: ");
            }
            System.out.println("User: " + usrCounter + " | Computer: " + pcCounter + " | Ties: " + tiesCounter);
            System.out.println("");
        }
        if (usrCounter > pcCounter) {
            System.out.println("YOU ARE THE WINNER!");
        } else if (usrCounter < pcCounter) {
            System.out.println("YOU ARE THE LOSER!");
        } else {
            System.out.println("FINAL SCORE IS A TIE, NO WINNER.");
        }
        
        PlayAgain();
        System.out.println("");
    } 
    
    public static boolean RoundsCheck(String usrEntry) {
        boolean validate = true;
	for (int i = 1; i <= 10; i++) {
            String iString = String.valueOf(i);
            if (usrEntry.equals(iString)) {
		validate = true;
                break;
            } else {
                validate = false;
            }
	}
	return validate;
        
    /*public static boolean RoundsCheck (String usrEntry) {

        boolean validate = true;
		    
	int usrEntryInt = Integer.parseInt(usrEntry);
        if (usrEntryInt > 0 && usrEntryInt < 11) {
	    validate = true;
        } else {
            validate = false;
        }
    	return validate;*/
    }
    
    public static void PlayAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Play again? (Y/N)");
        String playAgain = sc.nextLine();
        
        if (playAgain.equalsIgnoreCase("Y")) {
            Play();

        } else if (playAgain.equalsIgnoreCase("N")) {
            System.out.println("Thanks for playing! See you!");
            
        } else {
            System.out.println("Sorry, I didn't get that.");
            PlayAgain();
        }
    }
}
