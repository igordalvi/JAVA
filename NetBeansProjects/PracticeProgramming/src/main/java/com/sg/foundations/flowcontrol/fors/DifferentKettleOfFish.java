/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author igord
 */
public class DifferentKettleOfFish {
    public static void main(String[] args) {
        
        /* 
        int fish = 1;
        while(fish <= 10){
            if (fish == 3){
                System.out.println("RED fish!");
            } else if(fish == 4){
                System.out.println("BLUE fish!");
            } else{
                System.out.println(fish + " fish!");
            }

            fish++;
        }
        */
        
        for (int fish = 1; fish <=10; fish++) {
            if (fish == 3){
                System.out.println("RED fish!");
            } else if(fish == 4){
                System.out.println("BLUE fish!");
            } else{
                System.out.println(fish + " fish!");
            }
        }
        //To make the output look the same as it was in the while loop.
    }
    
}
