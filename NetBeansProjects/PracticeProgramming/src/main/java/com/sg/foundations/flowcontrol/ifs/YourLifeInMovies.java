/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author igord
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hey, let's play a game! What's your name?");
        String name = sc.nextLine();
        
        System.out.println("Ok, " + name + ", when were you born?");
        int year = Integer.parseInt(sc.nextLine());
        
        System.out.println("Well " + name + "...");
        
        if (year < 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
        }
        
        if (year < 1995) {
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
        }
        
        if (year < 1985) {
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
        }
        
        if (year < 1975) {
            System.out.println("Wow! Did you know that the original Jurassic Park release is closer to the first lunar landing than it is to today?");
        }
        
        if (year < 1965) {
            System.out.println("Time flies! MASH TV series has been around for almost half a century!");
        }
        
       
    }
}
