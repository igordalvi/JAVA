/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author igord
 */
public class StayPositive {
    public static void main(String[] args) {
        
        int countNow, countStop;
        
        System.out.println("What number should I count down from?");
        Scanner sc = new Scanner(System.in);
        countNow = Integer.parseInt(sc.nextLine());

        System.out.println("Here goes!");
        
        while (countNow > 0) {
        countStop = countNow-9;
        
            while (countStop < countNow && countNow > 0) {
                System.out.print(countNow + " ");
                countNow--;
            }
            System.out.println(countNow);
            countNow--;
        }
        System.out.println("");
        System.out.print("Blast off!");
        
    }
}
