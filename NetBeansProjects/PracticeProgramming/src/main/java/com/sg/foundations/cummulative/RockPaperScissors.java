/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.cummulative;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author igord
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        PlayAgain();
        /*Scanner sc = new Scanner(System.in);
        Random rps = new Random();
        
        System.out.println("How many rounds (min 1 and max 10)?");
        int roundsNumber = Integer.parseInt(sc.nextLine());
        
        if (roundsNumber < 1 || roundsNumber > 10) {
            System.out.println("Rounds number out of bounds.");
        } else {
            
            int usrChoice;
            int pcChoice;
            int usrCounter = 0;
            int pcCounter = 0;
            for (int roundNow = 1; roundNow <= roundsNumber; roundNow++) {
                System.out.print("Choose a number: ");
                System.out.println("1 for Rock, 2 for Paper, or 3 for Scissors");
                usrChoice = Integer.parseInt(sc.nextLine());
                
                if (usrChoice == 1) {
                    System.out.println("You chose 'Rock'");
                } else if (usrChoice == 2) {
                    System.out.println("You chose 'Paper'");
                } else if (usrChoice == 3) {
                    System.out.println("You chose 'Scissors'");
                } else {
                    System.out.println("Invalid.");
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
                    System.out.println("The current Score is: ");
                }
                System.out.println("User: " + usrCounter + "  |  Computer: " + pcCounter);
                System.out.println("");
            }
            if (usrCounter > pcCounter) {
                System.out.println("YOU ARE THE WINNER!");
            } else if (usrCounter < pcCounter) {
                System.out.println("YOU ARE THE LOSER!");
            } else {
                System.out.println("FINAL SCORE IS EVEN, NO WINNER.");
            } 
            
            System.out.println("Play again? (Y/N)");
            String playAgain = sc.nextLine();
            if (playAgain.equalsIgnoreCase("Y")) {
                PlayAgain();
            }
        }*/
    }
    public static void PlayAgain() {
        
        Scanner sc = new Scanner(System.in);
        Random rps = new Random();
        
        System.out.println("How many rounds (min 1 and max 10)?");
        int roundsNumber = Integer.parseInt(sc.nextLine());
        
        if (roundsNumber < 1 || roundsNumber > 10) {
            System.out.println("Rounds number out of bounds.");
        } else {
            
            int usrChoice;
            int pcChoice;
            int usrCounter = 0;
            int pcCounter = 0;
            for (int roundNow = 1; roundNow <= roundsNumber; roundNow++) {
                System.out.print("Choose a number: ");
                System.out.println("1 for Rock, 2 for Paper, or 3 for Scissors");
                usrChoice = Integer.parseInt(sc.nextLine());
                
                if (usrChoice == 1) {
                    System.out.println("You chose 'Rock'");
                } else if (usrChoice == 2) {
                    System.out.println("You chose 'Paper'");
                } else if (usrChoice == 3) {
                    System.out.println("You chose 'Scissors'");
                } else {
                    System.out.println("Invalid.");
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
                    System.out.println("The current Score is: ");
                }
                System.out.println("User: " + usrCounter + "  |  Computer: " + pcCounter);
                System.out.println("");
            }
            if (usrCounter > pcCounter) {
                System.out.println("YOU ARE THE WINNER!");
            } else if (usrCounter < pcCounter) {
                System.out.println("YOU ARE THE LOSER!");
            } else {
                System.out.println("FINAL SCORE IS EVEN, NO WINNER.");
            } 
            
            System.out.println("Play again? (Y/N)");
            String playAgain = sc.nextLine();
            if (playAgain.equalsIgnoreCase("Y")) {
                PlayAgain();
            } else {
                ThatsIt();
            }
        }
        
    }
    public static void ThatsIt() {
        String gameOver = "Thanks for playing! See you in the next one!";
        System.out.println(gameOver);
    }
}
