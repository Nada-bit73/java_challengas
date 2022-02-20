
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
        
        //Print the prices of each row on a separate line:
        System.out.println("Baking : " + prices[0][0] + " "+ prices[0][1] + " "+ prices[0][2] + " "+ prices[0][3] + " "+ prices[0][4] + " " );
        System.out.println("Beverage : " + prices[1][0] + " "+ prices[1][1] + " "+ prices[1][2] + " "+ prices[1][3] + " "+ prices[1][4] + " " );
        System.out.println("Cereals : " + prices[2][0] + " "+ prices[2][1] + " "+ prices[2][2] + " "+ prices[2][3] + " "+ prices[2][4] + " " );

    }
    
}
