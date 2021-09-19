/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 * To update the bird number printouts so the count is from 1 - 24, I changed initial value of birdsInPie and i to 1, and the "for-range" to 24. 
 *
 * @author igord
 */
public class ForAndTwentyBlackbirds {
    public static void main(String[] args) {
        
        int birdsInPie = 1;
        for (int i = 1; i < 24; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}
