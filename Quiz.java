
package quiz;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class Quiz {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      //Q1 
       System.out.println("Which country held the 2016 Summer Olympics?"
                + "\nA) China \nB) Ireland \nC) Brazil \nD) Italy");
        char answerOne = in.next().charAt(0);
      
      //Q2
      System.out.println("Which planet is the hottest? "
                + "\nA) Venus \nB) Saturn \nC) Mercury \nD) Mars");
        char answerTwo = in.next().charAt(0);
        
        //Q3
        System.out.println("What is the rarest blood type ?"
                + "\nA) O \nB) A \nC) B \nD) AB-Negative");
        char answerThree = in.next().charAt(0);
        
        //Q4
        System.out.println("\nWhich one of these characters are friends of Harry Potter ?"
                + "\nA) Ron Weasley \nB) Hermion Granger \nC) Draco Malfoy ");
       char answerFour = in.next().charAt(0); 
       
       int result = 0;
       // calculate the result
        if(answerOne == 'C' ){
            result += 5;
        }
        if(answerTwo == 'A' ){
           result += 5;
        }
        if(answerThree == 'D'){
            result += 5;
        }
        if(answerFour == 'A'){
             result += 5;
        }
        
        System.out.println("Your final result "+result+"/ 20");
        
        if (result == 20){
         System.out.println("Wow , you knew youe stuff !");
        }
        
     
    }
    
}
