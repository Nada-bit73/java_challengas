
package theweathernetwork;

/**
 *
 * @Nada
 */
public class TheWeatherNetwork {

    public static void main(String[] args) {
         int temp = 5;
        
        
        
        if(temp >= -15 && temp <= -1 ){
            System.out.println("The forecast is FREEZING! Stay home!");
        }else if(temp >= 0 && temp <= 10){
            System.out.println("The forecast is Chilly. Wear a coat!");   
        }else{
            System.out.println("It's warm. Go outside");   

        }
       
    }
    
}
