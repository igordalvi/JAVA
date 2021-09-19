/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author igord
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {

        String myName = "Igor";
	String myColor = "Electric Lime";
	String usrName, usrColor, usrFruit;
	int myFavNum = -7;
	int usrFavNum;
	
        

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there!");
	System.out.println("What's your name? ");
        usrName = inputReader.nextLine();
	System.out.println();

        System.out.println("Hi, " + usrName + "! " + "I'm " + myName + ".");
	System.out.println("What's your favorite color? ");
	usrColor = inputReader.nextLine();
	System.out.println();

	System.out.println("Huh, " + usrColor + "? Mine's " + myColor + ".");
	System.out.println();

	System.out.println("I really like limes. They're my favorite fruit, too.");
	System.out.println("What's YOUR favorite fruit, " + usrName + "?");
	usrFruit = inputReader.nextLine();
	System.out.println();

	System.out.println("Really? " + usrFruit + "? That's wild!");
	System.out.println("Speaking of favorites, what's your favorite number? ");
	usrFavNum = Integer.parseInt(inputReader.nextLine());
	System.out.println();

        System.out.println(usrFavNum + " is a cool number. Mine's " + myFavNum + ".");
	int numsProduct = usrFavNum * myFavNum;
	System.out.println("Did you know " + usrFavNum + " * " + myFavNum + " is " + numsProduct + " ? That's a cool number too!");
	System.out.println();

        System.out.println("Well, thanks for talking to me, " + usrName + "!");
        
    }
}
