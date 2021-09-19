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
public class MiniZork {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
                
            } else if (action.equals("stick your hand in")) { 
                System.out.println("You put your right hand inside the mailbox.");
                System.out.println("You feel a weird moisture living stuff touching the tip of your fingers.");
                System.out.println("Take your hands off or keep searching?");
                action = userInput.nextLine();
                
                if (action.equals("keep searching")) {
                    System.out.println("You found the House Key! Great job!");
                    System.out.println("Now you run back to the house and open the door.");
                    System.out.println("YOU ARE IN!!!");
                }
            }
        } else if (action.equals("Go to the house")) { 
            System.out.println("You go to the house.");
            System.out.println("The door is locked.");
            System.out.println("Go in through the window or go to the mailbox? ");
            action = userInput.nextLine();
            if (action.equals("Go in through the window")) {
                System.out.println("You climb the wall and reach the window.");
                System.out.println("You got a shot on your back.");
                System.out.println("You shouldn't have made yourself so visible by the sniper! You are dead now, game over..");
            } else if (action.equals("Go to the mailbox")) {
                System.out.println("You open the mailbox.");
                System.out.println("It's really dark in there.");
                System.out.println("Look inside or stick your hand in? ");
                action = userInput.nextLine();

                if (action.equals("Look inside")) {
                    System.out.println("You peer inside the mailbox.");
                    System.out.println("It's really very dark. So ... so very dark.");
                    System.out.println("Run away or keep looking? ");
                    action = userInput.nextLine();

                    if (action.equals("Keep looking")) {
                        System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                        System.out.println("You've been eaten by a grue.");
                    } else if (action.equals("Run away")) {
                        System.out.println("You run away screaming across the fields - looking very foolish.");
                        System.out.println("But you alive. Possibly a wise choice.");
                    }

                } else if (action.equals("Stick your hand in")) { 
                    System.out.println("You put your right hand inside the mailbox.");
                    System.out.println("You feel a weird moisture living stuff touching the tip of your fingers.");
                    System.out.println("Take your hands off or keep searching?");
                    action = userInput.nextLine();

                    if (action.equals("Keep searching")) {
                        System.out.println("You found the House Key! Great job!");
                        System.out.println("Now you run back to the house and open the door.");
                        System.out.println("YOU ARE IN!!!");
                    }
                }
            }
        }
    }
}
