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
public class DoItBetter {
    public static void main(String[] args) {

	double MilesRun, MyMilesRun;
        int QttOfHotDogs, MyQttOfHotDogs;
	int Languages, MyLanguages;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("How many miles can you run? ");
        MilesRun = Double.parseDouble(inputReader.nextLine());
	MyMilesRun = 2 * MilesRun + 1;
	System.out.println("Well, I can run " + MyMilesRun + " miles!");
	System.out.println();

	System.out.println("How many hotdogs can you eat?");
        QttOfHotDogs = Integer.parseInt(inputReader.nextLine());
	MyQttOfHotDogs = 2 * QttOfHotDogs + 1;
	System.out.println("Well, I can eat " + MyQttOfHotDogs + " hotdogs!");
	System.out.println();

	System.out.println("How many languages can you speak?");
        Languages = Integer.parseInt(inputReader.nextLine());
	MyLanguages = 2 * Languages + 1;
	System.out.println("Well, I can speak " + MyLanguages + " languages!");
	System.out.println();

    }
}
