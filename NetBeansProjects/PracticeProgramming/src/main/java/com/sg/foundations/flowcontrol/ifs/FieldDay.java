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
public class FieldDay {
    public static void main(String[] args) {
        String name;
        String aB = "Baggins";
        String bD = "Dresden";
        String dH = "Howl";
        String hP = "Potter";
        String pV = "Vimes";
        
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What's your name?");
        name = sc.nextLine();
        
        if ((name.compareToIgnoreCase(aB)) < 0){
            System.out.println("Aha! You're on the team \"Red Dragons\"!");
        } else if ((name.compareToIgnoreCase(bD)) < 0){
            System.out.println("Aha! You're on the team \"Dark Wizards\"!");
        } else if ((name.compareToIgnoreCase(dH)) < 0){
            System.out.println("Aha! You're on the team \"Moving Castles\"!");
        } else if ((name.compareToIgnoreCase(hP)) < 0){
            System.out.println("Aha! You're on the team \"Golden Snitches\"!");
        } else if ((name.compareToIgnoreCase(pV)) < 0){
            System.out.println("Aha! You're on the team \"Night Guards\"!");
        } else {
            System.out.println("Aha! You're on the team \"Black Holes\"!");
        }
    }
}
