/*
 * 
 * 
 */
package receipt;

import java.util.Arrays;

/**
 *
 * @Nada
 */
public class Taxes {

    public static void main(String[] args) {
        //prices with out the tax
      double[] prices ={1.99 , 2.99 , 3.99 , 4.99};
      //new array to store the total price 
      double[] pricesWithTax =new double[4];
      
      for(int i = 0 ; i < prices.length ; i++){
         
          pricesWithTax[i] = (prices[i]  + 0.13 * prices[i]); 
      }
       System.out.print("The original prices are: " + Arrays.toString(prices));
      System.out.println("\n\nhe prices after tax are: "+Arrays.toString(pricesWithTax));
       }
    
    
}
