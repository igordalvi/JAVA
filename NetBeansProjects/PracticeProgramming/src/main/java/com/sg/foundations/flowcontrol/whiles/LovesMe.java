/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 * I used "do-while", but in this case it wouldn't change the result if I used the "while" loop.
 *
 * @author igord
 */
public class LovesMe {
    public static void main(String[] args) {
        
        int petals = 34;
        
        System.out.println("Well here goes nothing...");
        
        /*do {
            if (petals % 2 == 0) {
                System.out.println("It loves me NOT!");
            } else {
                System.out.println("It loves me!");
            }
            petals--;
        } while (petals > 0);*/
        
        while (petals > 0) {
            if (petals % 2 == 0) {
                System.out.println("It loves me NOT!");
            } else {
                System.out.println("It loves me!");
            }
            petals--;
        }
        System.out.println("I knew it! It LOVES ME!");
    }
}
