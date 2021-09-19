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
public class HealthyHearts {
    public static void main(String[] args) {

	int usrAge;
	int maxHeartRate;
	float maxTargetHeartRate, minTargetHeartRate;
        

        Scanner inputReader = new Scanner(System.in);

        
	System.out.println("Healthy Heart Rate Calculator");
	System.out.println();
	System.out.println("What's your Age?");
        usrAge = Integer.parseInt(inputReader.nextLine());
	maxHeartRate = (220 - usrAge);
	maxTargetHeartRate = 0.85f * maxHeartRate;
	minTargetHeartRate = 0.5f * maxHeartRate;
	System.out.println();
	System.out.println("Your Healthy Heart Rate Zone while exercising should stay between " + minTargetHeartRate + " and " + maxTargetHeartRate + " heart beats per minute.");

    }
}
