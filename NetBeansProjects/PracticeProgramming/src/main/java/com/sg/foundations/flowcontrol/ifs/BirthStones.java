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
public class BirthStones {
    public static void main(String[] args) {
        String monthString, birthstone;
        int monthNumber;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What month's birthstone do you want to know?");
        monthNumber = Integer.parseInt(sc.nextLine());
        
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("I think you must be confused, " + monthNumber + " doesn't match a month.");
            
        } else {
            if (monthNumber == 1) {
            monthString = "January";
            birthstone = "Garnet";
            } else if (monthNumber == 2) {
                monthString = "February";
                birthstone = "Amethyst";
            } else if (monthNumber == 3) {
                monthString = "March";
                birthstone = "Aquamarine";
            } else if (monthNumber == 4) {
                monthString = "April";
                birthstone = "Diamond";
            } else if (monthNumber == 5) {
                monthString = "May";
                birthstone = "Emerald";
            } else if (monthNumber == 6) {
                monthString = "June";
                birthstone = "Pearl";
            } else if (monthNumber == 7) {
                monthString = "July";
                birthstone = "Ruby";
            } else if (monthNumber == 8) {
                monthString = "August";
                birthstone = "Peridot";
            } else if (monthNumber == 9) {
                monthString = "September";
                birthstone = "Sapphire";
            } else if (monthNumber == 10) {
                monthString = "October";
                birthstone = "Opal";
            } else if (monthNumber == 11) {
                monthString = "November";
                birthstone = "Topaz";
            } else {
                monthString = "December";
                birthstone = "Turquoise";
            }
            System.out.println(monthString + "'s birthstone is " + birthstone + ".");
        }
    }
}
