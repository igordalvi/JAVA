/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author igord
 */
public class CoinFlipper {
    public static void main(String[] args) {
        Random coinFlip = new Random();
        
        System.out.println("Ready, Set, Flip....!!");
        boolean flipResult = coinFlip.nextBoolean();
        if (flipResult) {
            System.out.println("You got TAILS!");
        } else {
            System.out.println("You got HEADS!");
        }
    }
}
