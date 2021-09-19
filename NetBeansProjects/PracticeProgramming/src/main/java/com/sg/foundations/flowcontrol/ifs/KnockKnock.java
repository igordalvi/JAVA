/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 * If I use "==" instead of ".equals", even if write the "Marty McFly" as answer, it won't print "Hey! That's right!...".
 * If don't type in the right capitalization, it won't print "Hey! That's right!...". To fix this, I should use 'equalsIgnoreCase".
 *
 * @author igord
 */
public class KnockKnock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Knock Knock! Guess who!! ");
        String nameGuess = sc.nextLine();

        if(nameGuess.equalsIgnoreCase("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future.");
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
}
