/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author igord
 */
public class LazyTeenager {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        int count = 1;
        int chanceToClean = randomizer.nextInt(91);
        System.out.println("Chance to Clean Starting at: " + chanceToClean + "%.");
        
        do {
            System.out.println("Clean your room!! (x" + count + ")");
            count++;
            chanceToClean = chanceToClean + 10;
            if (chanceToClean >= 100) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                break;
            } if (count == 7) {
                    System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                }
            
        } while (count < 7);
    }
}
