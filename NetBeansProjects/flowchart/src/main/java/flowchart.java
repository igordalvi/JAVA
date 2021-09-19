
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igord
 */
public class flowchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer;
        int guess;
        
        Random rGen = new Random();
        answer = rGen.nextInt(20) + 1;
        
        while (true) {
            System.out.println("Enter a guess between 1 and 20:");
            guess = sc.nextInt();
            if (guess == answer) {
                break;
            }
            
            if (guess < 1 || guess > 20) {
                System.out.println("Your guess must be between 1 and 20.");
                continue;
            }
            
            if (guess > answer) {
                System.out.println("Lower!!!");
                continue;
            }
            
            System.out.println("Higher!!!");
        }
        
        System.out.println("You got it! The answer was " + answer);
    }
}
