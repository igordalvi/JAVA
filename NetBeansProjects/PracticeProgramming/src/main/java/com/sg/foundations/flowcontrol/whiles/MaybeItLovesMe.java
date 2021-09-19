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
public class MaybeItLovesMe {
    public static void main(String[] args) {
        
        Random guessMe = new Random();
        int petals = guessMe.nextInt(77) + 13;
        int petalsVar = petals;
        
        System.out.println("This Daisy has: " + petals + ".");
        
        
        System.out.println("Well here goes nothing...");
        
        /*do {
            if (petals % 2 == 0) {
                System.out.println("It loves me NOT!");
            } else {
                System.out.println("It loves me!");
            }
            petals--;
        } while (petals > 0);*/
        
        while (petalsVar > 0) {
            if (petalsVar % 2 == 0) {
                System.out.println("It loves me NOT!");
            } else {
                System.out.println("It loves me!");
            }
            petalsVar--;
        }
        if (petals % 2 == 0) {
        System.out.println("I knew it! It LOVES ME!");
        } else {
            System.out.println("Awwww, bummer.");
        }
    }
}
