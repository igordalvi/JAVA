/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author igord
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {
        
        String color = colorRand(); // call color method here
        String animal = animalRand(); // call animal method again here
        String colorAgain = colorRand(); // call color method again here
        int weight = numberRand("weight"); // call number method,
            // with a range between 5 - 200
        int distance = numberRand("distance"); // call number method,
            // with a range between 10 - 20
        int number = numberRand("number"); // call number method,
            // with a range between 10000 - 20000
        int time = numberRand("time"); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    // ??? Method 1 ???
    public static String colorRand() {
        Random randomizer = new Random();
        int colorNum = randomizer.nextInt(4);
        
        if (colorNum == 0) {
            String color = "Green";
            return color;
        } else if (colorNum == 1) {
            String color = "Yellow";
            return color;
        } else if (colorNum == 2) {
            String color = "Blue";
            return color;
        } else if (colorNum == 3) {
            String color = "Red";
            return color;
        } else {
            String color = "White";
            return color;
        }
    }
    
    // ??? Method 2 ???
    public static String animalRand() {
        Random randomizer = new Random();
        int animalNum = randomizer.nextInt(4);
        
        if (animalNum == 0) {
            String animal = "Lion";
            return animal;
        } else if (animalNum == 1) {
            String animal = "Zebra";
            return animal;
        } else if (animalNum == 2) {
            String animal = "Bear";
            return animal;
        } else if (animalNum == 3) {
            String animal = "Gorilla";
            return animal;
        } else {
            String animal = "Wolf";
            return animal;
        }
    }
    
    // ??? Method 3 ???
    public static int numberRand(String forWhat) {
        Random randomizer = new Random();
        
        if (forWhat == "weight") {
            int weight = randomizer.nextInt(206)+5;
            return weight;
            
        } else if (forWhat == "distance") {
            int distance = randomizer.nextInt(11)+10;
            return distance;
            
        } else if (forWhat == "number") {
            int number = randomizer.nextInt(10001)+10000;
            return number;
            
        } else if (forWhat == "time") {
            int time = randomizer.nextInt(5)+2;
            return time;
        } else {
            return 0;
        }
    }
}
 

