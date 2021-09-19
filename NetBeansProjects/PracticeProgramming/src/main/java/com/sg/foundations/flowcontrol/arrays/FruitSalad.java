/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author igord
 */
public class FruitSalad {
    public static void main(String[] args) {
        
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];
        int index = 0;

        // Code Recipe for fruit salad should go here!
        
        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i].contains("berry") && index < 12) {
                fruitSalad[index] = fruit[i];
                if (index == 0) {
                    System.out.print(fruit[i]);
                } else {
                    System.out.print(", " + fruit[i]);
                }
                index++;
            }
        }  
        int apple = 0;
        int orange = 0;
        
        for (int i = 0; i < fruit.length; i++) {
            
            if (!(fruit[i].contains("Tomato")) && !(fruit[i].contains("berry")) && index < 12) {
                if (fruit[i].contains("Apple") && apple < 3) {
                    fruitSalad[index] = fruit[i];
                    System.out.print(", " + fruit[i]);
                    apple++;
                    index++;
                    
                } else if (fruit[i].contains("orange") && orange < 2) {
                    fruitSalad[index] = fruit[i];
                    System.out.print(", " + fruit[i]);
                    orange++;
                    index++;
                    
                } else {
                    fruitSalad[index] = fruit[i];
                    System.out.print(", " + fruit[i]);
                    index++;
                    
                }
            }
        }
    }
}
