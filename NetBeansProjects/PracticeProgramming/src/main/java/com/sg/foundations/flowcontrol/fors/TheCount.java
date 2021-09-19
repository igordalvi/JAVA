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
public class TheCount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        
        System.out.println("Start at :");
        int start = Integer.parseInt(sc.nextLine());
        
        System.out.println("Stop at :");
        int stop = Integer.parseInt(sc.nextLine());
        
        System.out.println("Count by :");
        int countBy = Integer.parseInt(sc.nextLine());
        
        for (int i = start; i < stop; i = i + countBy) {
            System.out.print(i + " ");
            if (i == start + 2*countBy) {
                System.out.println("- Ah ah ah!");
            }
        }
    }
}
