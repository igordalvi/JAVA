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
public class InterestCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("How much do you want to invest?");
        float ammount = Float.parseFloat(sc.nextLine());
        System.out.println("You entered the ammount of $" + ammount + " to invest.");
        System.out.println("");
        
        System.out.println("How many years are investing?");
        int time = Integer.parseInt(sc.nextLine());
        System.out.println("You entered the time of " + time + " years of investment.");
        System.out.println("");
        
        System.out.println("What is the annual interest rate % growth?");
        float yearRate = Float.parseFloat(sc.nextLine());
        System.out.println("You entered: " + yearRate + "% of interest annual rate.");
        System.out.println("");
        
        System.out.println("Interest compound periods (quarterly, monthly, or daily ?)");
        String compoundFrequency = sc.nextLine();
 
        int compoundPeriods;
        
        if (compoundFrequency.equalsIgnoreCase("quarterly")) {
            compoundPeriods = 4;
        } else if (compoundFrequency.equalsIgnoreCase("monthly")) {
            compoundPeriods = 12;
        }  else if (compoundFrequency.equalsIgnoreCase("daily")) {
            compoundPeriods = 360;
        } else {
            compoundPeriods = 1;
        }
        System.out.println("Calculating...");
        
        float earned = 0;
        float rate = (yearRate/compoundPeriods)/100;
        float moneyStart = ammount;
        float currentMoney;
        float StartAmmount = ammount;
        
        for(int i = 1; i <= time; i++) {
            for (int j = 0; j < compoundPeriods; j++) {
                if (j == 0) {
                    StartAmmount = moneyStart;
                }
                currentMoney = moneyStart*(1 + rate);
                earned += moneyStart*rate;
                moneyStart = currentMoney;
            }
            /*
            float StartAmmountPrint1 = StartAmmount*100;
            float StartAmmountPrint2 = Math.round(StartAmmountPrint1);
            float StartAmmountPrint = StartAmmountPrint2/100;
            
            float earnedPrint1 = earned*100;
            float earnedPrint2 = Math.round(earnedPrint1);
            float earnedPrint = earnedPrint2/100;
           
            float moneyStartPrint1 = moneyStart*100;
            float moneyStartPrint2 = Math.round(moneyStartPrint1);
            float moneyStartPrint = moneyStartPrint2/100;
            */
            
            System.out.println("Year " + i + ":");
            System.out.println("Began with $" + String.format("%.2f", StartAmmount));
            System.out.println("Earned $" + String.format("%.2f", earned));
            System.out.println("Ended with $" + String.format("%.2f", moneyStart));
            System.out.println("");
            earned = 0;
        }
    }
}
