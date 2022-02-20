
package weatheroftheday;
/*
the goal is to 
1. print the temperatures In Celsius
2.convert Celsius to fahrenheit
3.round the result 
*/
import java.util.Arrays;

/**
 *
 * @Nada
 */
public class WeatherOfSevenDays {

    public static void main(String[] args) {
        
        double[] temperaturesInCelsius = {12.5 , 14.5 , 17.0 , 21.0 , 23.0 , 18.5 , 20.0};
        
        double[] fahrenheit = celciusToFahrenheit(temperaturesInCelsius);
        printTemperatures(fahrenheit,"fahrenheit");
        printTemperatures(temperaturesInCelsius,"celsius");

        
    }
    /**
 * Function name: celciusToFahrenheit.
 * @param celsius ( double[] )
 * @return fahrenheit ( double[] )
 *
 * Inside the function:
 *    1. Creates an array 'fahrenheit'.
 *    2. Copies all the values from celsius to fahrenheit.
 *    3. Updates the fahrenheit values (F = (C/5 * 9) + 32).
 *    4. returns the fahrenheit array.
 */
    
    public static double[] celciusToFahrenheit(double [] celsius){
        double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
        
        for(int i =0 ; i < fahrenheit.length ; i++){
    
    fahrenheit[i] =((celsius[i] /5 * 9) + 32);
    
    
}
        return fahrenheit;
    }
    
    /** Task 3
 * Function name - printTemperatures
 * @param temp ( double[] )
 * @param type ( String ) can be: Celsius or Fahrenheit
 *
 * Inside the function:
 *
 *  1. A loop prints the temperatures in ONE line:
 *       Celsius: [Celsius values separated by a space]
 *       Fahrenheit: [Fahrenheit values separated by a space]
 *  2. Adds a new line of space after the for loop.
 */
    
    public static void printTemperatures(double[] temp , String type){
        
        
         
           System.out.print(type + ": ");

         for(int i =0 ; i < temp.length ; i++){
          temp[i] = Math.round(temp[i] * 10.0) / 10.0;
          System.out.print(temp[i] + "  ");
    
    
}
                   System.out.print( "\n");

         
    }
    
}
