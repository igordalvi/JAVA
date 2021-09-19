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
public class AllTheTrivia {
    public static void main(String[] args) {

        String usrAnswer1, usrAnswer2, usrAnswer3, usrAnswer4;

        Scanner inputReader = new Scanner(System.in);
	
	System.out.println("What unit is equivalent to 1,024 Gigabytes? ");
	usrAnswer1 = inputReader.nextLine();
	System.out.println();

	System.out.println("Which planet is the only one that rotates clockwise in our Solar System? ");
	usrAnswer2 = inputReader.nextLine();
	System.out.println();

	System.out.println("The largest volcano ever discovered in our Solar System is located on which planet? ");
	usrAnswer3 = inputReader.nextLine();
	System.out.println();

	System.out.println("What is the most abundant element in the earth's atmosphere? ");
	usrAnswer4 = inputReader.nextLine();
	System.out.println();



	System.out.println("Wow, 1,024 Gigabytes is a " + usrAnswer3 + "!");
	System.out.println();

	System.out.println("I didn't know that the largest ever volcano was discovered on " + usrAnswer1 + "!");
	System.out.println();

	System.out.println("That's amazing that " + usrAnswer2 + " is the most abundant element in the atmosphere...");
	System.out.println();

	System.out.println(usrAnswer4 + " is the only planet that rotates clockwise, neat!");
	System.out.println();
        
    }
}
