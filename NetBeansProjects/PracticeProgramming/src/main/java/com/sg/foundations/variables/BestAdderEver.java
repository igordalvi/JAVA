/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

import java.util.Scanner;

/**
 *
 * @author igord
 */
public class BestAdderEver {
    public static void main(String[] args) {
        int FirstNumber, SecondNumber, ThirdNumber, Result;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter the first Number: ");
        FirstNumber=myScanner.nextInt();
        System.out.println("Please enter the second Number: ");
        SecondNumber=myScanner.nextInt();
        System.out.println("Please enter the third Number: ");
        ThirdNumber=myScanner.nextInt();
        System.out.println("The Total Sum of these numbers is: ");
        Result=FirstNumber+SecondNumber+ThirdNumber;
        System.out.println(FirstNumber+" + "+SecondNumber+" + "+ThirdNumber+" = "+Result);
    }
}
