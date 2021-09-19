/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author igord
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        
        int number = Integer.parseInt(sc.nextLine());
        int range = 0;
        
        System.out.println("");
        
        for (int i = 0; range < number; i++) {
            if (i%3==0 && i%5==0 && i != 0){
                System.out.println("fizz buzz");
                range++;
            } else if(i%3==0 && i != 0){
                System.out.println("fizz");
                range++;
            } else if (i%5==0 && i != 0) {
                System.out.println("buzz");
                range++;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!!!!!");
    }
    
}
