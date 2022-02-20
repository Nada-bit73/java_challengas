/*
create 100 x 10 array
populated with randomes btw 1 and 100 !
*/
package randomnumbers;

/**
 *
 * @Nada
 */
public class RandomNumbers {

    public static void main(String[] args) {
        
        //Create a 2D array with 100 rows and 10 columns. Then, call print2DArray.
       int[][] myTringTimes = new int[100][10];
       print2DArray(myTringTimes);
       
    }
    /**
 * Function name: randomNumber.
 *
 * @return randomNumber (int)
 *
 * Inside the function:
 *    1. return a random number between 1 and 100.
 */
    public static int getRandomNumber(){
        
        double randomElement = Math.random() * 100 ;
        randomElement += 1 ; 
        return (int)randomElement;
    }
    
    /**
 * Function name: print2DArray
 * @param array ( int[][] )
 *
 * Inside the function:
 *  1. print the array such that:
 *       - Each row takes up one line.
 *       - There's a space between each value.
 */
    
    public static void print2DArray(int[][] array){
          for(int i = 0 ; i < 100 ; i++){
            
           for(int j = 0 ; j < 10 ; j++){
               array[i][j] = getRandomNumber();
           System.out.print( array[i][j] + " " );
        } 
           System.out.println("\n");

          
        }
    }
}
