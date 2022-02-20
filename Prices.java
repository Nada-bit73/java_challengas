
package prices;

/**
 *
 * @Nada
 */
public class Prices {

    public static void main(String[] args) {
        // Task 1: Create a 2D array of double values that can hold 3 rows and 5 elements per row.
        double[][] prices = {
            { 12.99 ,8.99 ,9.99 ,10.45 ,11.99},
            {0.99 , 1.99 , 2.45 , 1.49 , 2.99},
            {8.99 , 7.99 , 9.49 , 9.99 , 10,99}
        };
        
        
        for(int i = 0 ; i < 3 ; i++){
            if(i == 0 ){
               System.out.print("\nBaking:" ); 
           }else  if(i == 1 ){
               System.out.print("\nBeverage:" ); 
           }else if(i == 2 ){
               System.out.print("\nCereals:" ); 
           }
           for(int j = 0 ; j < 5 ; j++){
           System.out.print( prices[i][j] + " " );
        } 
           
          
        }
        
    }
    
}
