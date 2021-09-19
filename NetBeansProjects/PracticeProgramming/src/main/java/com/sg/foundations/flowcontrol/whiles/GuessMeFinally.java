/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author igord
 */
public class GuessMeFinally {
    public static void main(String[] args) {
        
        Random guessMe = new Random();
        int number = guessMe.nextInt(201) - 100;
        int userNumb;
        
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        userNumb = Integer.parseInt(sc.nextLine());
        System.out.println("Your guess: " + userNumb);
        System.out.println("");
        
        if (userNumb == number) {
            System.out.println("Wow, nice guess! That was it!");
            
        } else if (userNumb < number){
            System.out.println(userNumb + "? Ha, nice try - too low! Try again:");
            
        } else {
            System.out.println(userNumb + "? Ha, nice try - too high! Try again:");
        }
        
        while (userNumb != number) {
            userNumb = Integer.parseInt(sc.nextLine());
            System.out.println("Your guess: " + userNumb);
            System.out.println("");
            
            if (userNumb == number) {
                System.out.println("Finally! It's about time you got it!");
            } else if (userNumb < number){
                System.out.println(userNumb + "? Ha, nice try - too low! Try again:");
            } else {
                System.out.println(userNumb + "? Ha, nice try - too high! Try again:");
            } 
        }
    }
}
