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
public class GuessMe {
    public static void main(String[] args) {
        int number = 3;
        
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("I've chosen a number between 1 and 5. Betcha can't guess it!");
       
        int userNumb = Integer.parseInt(sc.nextLine());
        System.out.println("Your guess: " + userNumb);
        System.out.println("");
        
        if (userNumb == number) {
            System.out.println("Wow, nice guess! That was it!");
        }
        
        else if (userNumb < number) {
            System.out.println(userNumb + "? Ha, nice try - too low! I chose " + number + "!");
        }
        
        else {
            System.out.println(userNumb + "? Too bad, way too high. I chose " + number + "!");
        }
    }
}
