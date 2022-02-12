/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theapplestore;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class TheAppleStore {

    public static void main(String[] args) {
        int numOfCustomers = 5;
        int applesInTheStore = 50;
       double priceOfApple = 1.5;
       double profit = 0.0;
       Scanner in = new Scanner(System.in);
       for(int i=0;i<numOfCustomers;i++){
       System.out.println("How Many Apples In Your Basket ?");
       int appleInTheBasket = in.nextInt();
       applesInTheStore -=appleInTheBasket;
       profit=appleInTheBasket*priceOfApple;
       }
       System.out.println("WOW! the profit = "+profit+"$\nThere is "+applesInTheStore+" Apples Left.");
       
    }
    
}
