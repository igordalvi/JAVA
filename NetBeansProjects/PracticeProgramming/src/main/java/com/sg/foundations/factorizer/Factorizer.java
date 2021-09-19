/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.factorizer;

import java.util.Scanner;

/**
 *
 * @author igord
 */
public class Factorizer {
    public static void main(String[] args) {
        
        System.out.println("What number would you like to factor?");
        
        Scanner sc = new Scanner(System.in);
        
        int number = Integer.parseInt(sc.nextLine());
        
        int counter = 1;
        
        for (int i = 1; i < number; i++) {
            if (number % (number - i) == 0) {
                counter++;   
            }
        }
        
        int[] factorsArray = new int[counter];
        /*
        System.out.println("The factors of " + number + " are:");
        int j = 0;
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                
                System.out.print(i + " ");
                factorsArray[j] = i;
                j++;
            }
        }
        */
        
        System.out.println("The factors of " + number + " are:");
        int j = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                
                System.out.print(i + " ");
                factorsArray[j] = i;
                j++;
            }
        }
        System.out.println("");
        System.out.println(number + " has " + counter + " factors.");
        
        int sum = 0;
        for (int k = 0; k < counter - 1; k++) {
            sum += factorsArray[k];
        }
        
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } 
        else {
            System.out.println(number + " is NOT a perfect number.");
        }
        
        if (factorsArray.length == 2) {
            System.out.println(number + " is a prime number.");
        } 
        else {
            System.out.println(number + " is NOT a prime number.");
        }
 
    }
}
