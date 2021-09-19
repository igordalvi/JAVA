/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.factorizer;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author igord
 */
public class LuckySevens {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float currentMoney = 0;
        int totalRolls = 0;
        int maxMoneyRoll = 0;
        
        System.out.println("How many dollars do you have to bet?");
        currentMoney = Float.parseFloat(sc.nextLine());
        
        float maxMoney = currentMoney;
        
        int roll1, roll2;
        
        while (currentMoney > 0) {
            roll1 = RollDice();
            roll2 = RollDice();
            
            int diceTotal = roll1 + roll2;
            System.out.println("Your Dices Rolled " + roll1 + " and " + roll2 + ". Total: " + diceTotal + ".");
            
            totalRolls++;
            
            if (diceTotal == 7) {
                currentMoney += 4;
                System.out.println("LUCKY SEVEN! YOU GAINED $4.00 IN THIS ROLL!");
                
                if (currentMoney > maxMoney) {
                    maxMoney = currentMoney;
                    maxMoneyRoll = totalRolls;
                }
            } else {
                currentMoney -= 1;
                System.out.println("Sorry, you lost $1.00 in this bad roll...");
            }
            
            System.out.println("Your current money is $" + String.format("%.2f", currentMoney) + ".");
            System.out.println("");
        }
        
        System.out.println("You broke after " + totalRolls + " rolls. You have no money left to play.");
        if (maxMoneyRoll == 0) {
            System.out.println("You shouldn't even have started playing. You never got more money than what you had to bet in the beginning of the game!");
        } else {
        System.out.println("You should've quit after " + maxMoneyRoll + " rolls, when you had $" + String.format("%.2f", maxMoney) + ".");
        }
    }
    
    public static int RollDice() {
        Random dice = new Random();
        return dice.nextInt(6)+1;
    }
}
