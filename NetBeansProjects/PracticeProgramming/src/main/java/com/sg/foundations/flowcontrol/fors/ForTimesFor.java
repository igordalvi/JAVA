/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author igord
 */
public class ForTimesFor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int timesResult, userNumber, userAnswer;
        int score = 0;
        
        System.out.println("Which times table shall I recite?");
        userNumber = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= 15; i++) {
            timesResult = i * userNumber;
            System.out.println(i + " * " + userNumber + " is: ");
            userAnswer = Integer.parseInt(sc.nextLine());
            if (userAnswer == timesResult) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry no, the answer is: " + timesResult);
            }
        }
        
        System.out.println("You got " + score + " correct.");
        float scored = score;
        float scoreGrade = (scored / 15) * 100;
        DecimalFormat df = new DecimalFormat("#.##");
        if (scoreGrade < 50) {
            System.out.println("You should study more. Your grade is " + df.format(scoreGrade) + "% (you need at least 50% to pass).");
        } else if (scoreGrade > 90) {
            System.out.println("Congratulations! Your grade is " + df.format(scoreGrade) + "%! It's over 90% (A+).");
        } else {
            System.out.println("You passed and your grade is " + df.format(scoreGrade) + "%.");
        }
    }
    
}
