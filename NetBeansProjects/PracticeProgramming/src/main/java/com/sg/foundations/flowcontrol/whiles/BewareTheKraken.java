/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 * If you turn the while loop's condition to just read "true", it wouldn't make any difference.
 *
 * @author igord
 */
public class BewareTheKraken {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random randomizer = new Random();
        
        String fish0 = "Golden Fish";
        String fish1 = "Hammer Shark";
        String fish2 = "Nemo";
        
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;
        
        while(depthDivedInFt < 36200){
            int fishNum = randomizer.nextInt(3);
            
            if (fishNum == 0) {
            System.out.println(fish0);
            }
            
            if (fishNum == 1) {
            System.out.println(fish1);
            }
            
            if (fishNum == 2) {
            System.out.println(fish2);
            }
            
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");
            System.out.println("Wanna stop now? (y/n)");
            String keepGoing = sc.nextLine();
            
            if (keepGoing.equals("y")) {
                System.out.println("Surface!");
                break;
            }

            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }
            
            depthDivedInFt += 1000;
            
            
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
    
}
