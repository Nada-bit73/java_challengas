/*
 * These are the temperatures for noon, evening, 
 * and midnight in Fahrenheit. We need to convert them to Celsius
 * 
 */
package weather;

/**
 *
 * @Nada
 */
public class Weather {

    public static void main(String[] args) {
      
        //define Three temperature in fahrenheit
        
        double noon = 77;          //temperature in fahrenheit.
        double evening  = 61;      //temperature in fahrenheit
        double midNight = 55;        //temperature in fahrenheit
        
        //Print the Temperatures
           printTemperatures(noon);
           printTemperatures(evening);
           printTemperatures(midNight);
    }
    //convert from fahrenheit To Celsius
    public static double fahrenheitToCelsius(double fahrenheit ){
        //C = (F - 32) * 5/9
        double celsius = (fahrenheit- 32) * 5/9;
        return celsius ;
        
    }
    
    public static void printTemperatures(double fahrenheit){
       /** Inside the function:
        *  1. prints the fahrenheit value: "F: temp in fahrenheit".
        *  2. calls fahrenheitToCelsius, and
        *  prints the celcius value: "C: temp in celsius \n".
       */
       
       System.out.println("\ntemp in fahrenheit "+fahrenheit+"\nemp in celsius "+fahrenheitToCelsius(fahrenheit));
    }
    
}
