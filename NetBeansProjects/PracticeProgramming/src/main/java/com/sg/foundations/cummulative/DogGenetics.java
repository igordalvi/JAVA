/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.cummulative;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author igord
 */
public class DogGenetics {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random dogRandom = new Random();
        
        System.out.println("What is your dog's name?");
        String dogName = sc.nextLine();
        
        System.out.println("");
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");
        System.out.println("");
        
        int bernard = dogRandom.nextInt(100)+1;
        int chihuahua = dogRandom.nextInt(100-bernard)+1;
        int asian = dogRandom.nextInt(100-bernard-chihuahua)+1;
        int cur = dogRandom.nextInt(100-bernard-chihuahua-asian)+1;
        int doberman = 100 - bernard - chihuahua - asian - cur;
        
        System.out.println(bernard + "% St. Bernard");
        System.out.println(chihuahua + "% Chihuahua");
        System.out.println(asian + "% Dramatic RedNosed Asian Pug");
        System.out.println(cur + "% Common Cur");
        System.out.println(doberman + "% King Doberman");
        System.out.println("");
        
        System.out.println("Wow, that's QUITE the dog!");
    }
}
