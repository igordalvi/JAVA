/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author igord
 */
public class TriviaNight {
    public static void main(String[] args) {
        
        int score = 0;
        int answer;
        int questions = 3;
        String answerString;
        
        Scanner sc = new Scanner(System.in);

              
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println("");
        
        System.out.println("FIRST QUESTION!");
        System.out.println("What's capital of Canada?");
        System.out.println("");
        System.out.print("1) Toronto      ");
        System.out.println("2) Vancouver");
        System.out.print("3) Ottawa        ");
        System.out.println("4) Edmonton");
        System.out.println("");
        
        System.out.println("YOUR ANSWER (1, 2, 3 or 4): ");
        
        answerString = sc.nextLine();
        answer = Integer.parseInt(answerString);
        
        if (answer == 3) {
            score ++;
            System.out.println("Correct! Your score is now: " + score);
            
        } else {
            System.out.println("Incorrect. Your score is: " + score);
        }
        
        questions--;
        
        System.out.println("Questions left: " + questions + ".");
        System.out.println("");
        
        
        System.out.println("SECOND QUESTION!");
        System.out.println("What's capital of the USA?");
        System.out.println("");
        System.out.print("1) New York      ");
        System.out.println("2) Washington DC");
        System.out.print("3) Miami       ");
        System.out.println("4) Los Angeles");
        System.out.println("");
        
        System.out.println("YOUR ANSWER (1, 2, 3 or 4): ");
        
        answerString = sc.nextLine();
        answer = Integer.parseInt(answerString);
        
        if (answer == 2) {
            score ++;
            System.out.println("Correct! Your score is now: " + score);
            
        } else {
            System.out.println("Incorrect. Your score is: " + score);
        }
        
        questions--;
        
        System.out.println("Questions left: " + questions + ".");
        System.out.println("");
        
        System.out.println("LAST QUESTION!");
        System.out.println("What's capital of Brazil?");
        System.out.println("");
        System.out.print("1) Sao Paulo      ");
        System.out.println("2) Rio de Janeiro");
        System.out.print("3) Salvador         ");
        System.out.println("4) Brasilia");
        System.out.println("");
        
        System.out.println("YOUR ANSWER (1, 2, 3 or 4): ");
        
        answerString = sc.nextLine();
        answer = Integer.parseInt(answerString);
        
        if (answer == 4) {
            score ++;
            System.out.print("Correct! Your Final score is: " + score + ". ");
            
        } else {
            System.out.print("Incorrect. Your Final score is: " + score + ". ");
        }
        
        
        if (score == 3) {
            System.out.println("Great Job!");
        } else if (score == 2) {
            System.out.println("Good Job.");
        } else if (score == 1) {
            System.out.println("Not good enough.");
        } else {
            System.out.println("You need to go back to school!");
        }
                
    }
}
