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
public class ForTimes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int timesResult, userNumber;
        
        System.out.println("Which times table shall I recite?");
        userNumber = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= 15; i++) {
            timesResult = i * userNumber;
            System.out.println(i + " * " + userNumber + " is: " + timesResult);
        }
    }
}
