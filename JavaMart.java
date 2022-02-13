/*
 * 
 * 
 */
package javamart;

/**
 *
 * @Nada
 */
public class JavaMart {

    public static void main(String[] args) {
         double wallet = 100;
         double toyCar = 5.99;
         double nike = 95.99;
                 
        wallet=buyToyCar(wallet,toyCar); 
          
       buyNick(wallet,nike);
         
    }
    //car toy
    public static double buyToyCar(double wallet,double priceOfToy){
    System.out.p﻿r﻿intln("Can I ﻿get this car?");
         if(wallet >= priceOfToy){
             System.out.println("Sure!");
             wallet -= priceOfToy;
          return(wallet);   
         }else{
             System.out.println("Sorry Your Budget is not enough");
             return(wallet);
         }       
}
    
      //nick shoes   
    public static double buyNick(double wallet,double nickShoes){
    System.out.println("\nCan I get these nike shoes?");
           if(wallet >= nickShoes){
             System.out.println("Sure!");
             wallet -= nickShoes;
             return(wallet);   
            }else{
             System.out.println("Sorry Your Budget is not enough");
             return(wallet);
         }
    }
}
