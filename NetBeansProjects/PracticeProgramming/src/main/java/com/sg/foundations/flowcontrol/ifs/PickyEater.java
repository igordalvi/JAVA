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
public class PickyEater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many times has it been fried? (#) ");
        int timesFried = Integer.parseInt(sc.nextLine());

        System.out.println("Does it have any spinach in it? (y/n) ");
        String hasSpinach = sc.nextLine();

        System.out.println("Is it covered in cheese? (y/n) ");
        String cheeseCovered = sc.nextLine();

        System.out.println("How many pats of butter are on top? (#) ");
        int butterPats = Integer.parseInt(sc.nextLine());

        System.out.println("Is it covered in chocolate? (y/n) ");
        String chocolatedCovered = sc.nextLine();

        System.out.println("Does it have a funny name? (y/n) ");
        String funnyName = sc.nextLine();

        System.out.println("Is it broccoli? (y/n) ");
        String isBroccoli = sc.nextLine();

        // Conditionals should go here! Here's the first one for FREE!

        if (hasSpinach.equals("y") || funnyName.equals("y")) {
            System.out.println("There's no way he'll eat that!");
        }
        if (2 < timesFried && timesFried < 4 && chocolatedCovered.equalsIgnoreCase("y")) {
            System.out.println("Oh, it's like a deep-fried Snickers. That'll be a hit!");
        }
        if (timesFried == 2 && cheeseCovered.equalsIgnoreCase("y")) {
            System.out.println("Mmm. Yeah, he'll each fried cheesy doodles.");
        }
        if (isBroccoli.equalsIgnoreCase("y")) {
            if (butterPats > 6 && cheeseCovered.equalsIgnoreCase("y")) {
            System.out.println("As long as the green is hidden by cheddar, it'll happen!");
            } else {
                System.out.println("Oh, green stuff like that might as well go in the bin.");
            }
        }
    }
}
