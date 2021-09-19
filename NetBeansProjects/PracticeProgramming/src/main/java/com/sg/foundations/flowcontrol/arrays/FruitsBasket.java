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
public class FruitsBasket {
    public static void main(String[] args) {
        
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        // Fruit counting code goes here!
        System.out.println("Total# of Fruit in Basket: " + fruitBasket.length);
        
        int orange = 0;
        int apple = 0;
        
        for (int i=0; i < fruitBasket.length; i++) {
            if (fruitBasket[i] == "Orange") {
               orange++;
            } else if (fruitBasket[i] == "Apple") {
               apple++;
            }
        }
        
        System.out.println("Number of Apples: " + apple);
        System.out.println("Number of Oranges: " + orange);
        System.out.println("Number of Other Fruit: " + (fruitBasket.length-apple-orange));
                

        // Print The Results!
    }
    
}
