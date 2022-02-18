
package highscore;

/**
 *
 * @Nada
 */
public class HighScore {
//create array of randoms , define the greatest integer , and its index 
    public static void main(String[] args) {
        
        int[] randomNumbers = new int[10];
     
        for(int i = 0 ; i < randomNumbers.length ; i++){
        randomNumbers[i] = getRandimNumber();
        System.out.print(randomNumbers[i] + "  ");
            
        }
       
     System.out.println("with The highest Score =  "+ findMax(randomNumbers)+" Give that man a cookie!");
    }
    
    //1.Make a function that returns a random number between 0 and 50,000.

public static int getRandimNumber(){
    
    double randomNumber = Math.random()*50000;
    randomNumber += 1; //btw 0 and 50.000
    return (int)randomNumber;
    
}

public static int findMax(int[] randomNumbers){
    int highScore = randomNumbers[0];
    int setHighestNumberIndex = 0;
     for(int i = 0 ; i < randomNumbers.length ; i++){
                 
       if(randomNumbers[i] > highScore) {
           highScore = randomNumbers[i];
           setHighestNumberIndex= i;  
       }     
        }
     
     getHighestNumberIndex(setHighestNumberIndex);
     return highScore;
       
}
 //print the result
public static void getHighestNumberIndex(int i){
     System.out.println("\n\nIt's the gentleman in seat: "+i);

}
}

