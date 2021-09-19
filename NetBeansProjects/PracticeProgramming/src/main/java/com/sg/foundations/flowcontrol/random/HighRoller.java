/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author igord
 */
public class HighRoller {
    public static void main(String[] args) {
        Random diceRoller = new Random();
        int numSides;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many sides does the dice you want to play have?");
        numSides = Integer.parseInt(sc.nextLine());

        int rollResult = diceRoller.nextInt(numSides) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure! Ouch.");
        }
        if (rollResult == numSides) {
            System.out.println("You rolled a critical! Nice job!");
        }
    }
}
