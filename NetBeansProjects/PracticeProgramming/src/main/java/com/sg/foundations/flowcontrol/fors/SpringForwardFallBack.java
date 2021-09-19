/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 * The start/stop ranges of output for both loops: 0-9 and 10-1.
 * How can you update the first loop so that it prints out the same range as the second loop, changing only the start point or the stopping point: changed initial value of i and replaced "<" with "<=".
 *
 * @author igord
 */
public class SpringForwardFallBack {
    public static void main(String[] args) {
        
        System.out.println("It's Spring...!");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
    }
}
