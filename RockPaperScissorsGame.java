
package rockpaperscissorsgame;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class RockPaperScissorsGame {

    public static void main(String[] args) {
        // Task 1: See if the user wants to play
        Scanner in = new Scanner (System.in);
        System.out.println("Are you ready to play ? Enter 'yes' to start ");
        String areReady = in.nextLine();
        
        //Task 2: Set up the game.
        if(areReady.equals("yes")){
           System.out.println("Great!\n\nrock -- paper -- scissors, shoot!");
           String userChoice = in.nextLine();
           
          
           EvaluateChoices(userChoice , computerChoice());
           
        }else{
           System.out.println("Darn, some﻿ other time...!");
  
        }

        
    }
    
    public static void EvaluateChoices(String userChoice ,String computerChoice ){
         System.out.println("\nYou chose: " + userChoice); 
         System.out.println("The computer chose: " + computerChoice);
         
         switch(userChoice){
             case "rock":
                 if (computerChoice.equals("rock")){
                    System.out.println("You Both Win !") ;
                 }else if(computerChoice.equals("paper")){
                     System.out.println("The computer Win !") ;
                 }else if(computerChoice.equals("scissors")){
                     System.out.println("You Win !") ;
                 }
                 break;
             case "paper":  
                 if (computerChoice.equals("rock")){
                    System.out.println("You Win !") ;
                 }else if(computerChoice.equals("paper")){
                     System.out.println("The both Win !") ;
                 }else if(computerChoice.equals("scissors")){
                     System.out.println("The computer Win !") ;
                 }
                  break;
             case "scissors":  
                  if (computerChoice.equals("rock")){
                     System.out.println("The computer Win !") ;
                 }else if(computerChoice.equals("paper")){
                     System.out.println("You Win !") ;
                 }else if(computerChoice.equals("scissors")){
                    System.out.println("The both Win !") ;
                 }
                   break;
             default :
                System.out.println("Please Enter vallid choice ..") ; 
         } 
         
    
             
         
        
    }
    //Task 3: Generate a random choice

  public static String computerChoice(){
      String computerChoice ;
      
      double randomNum = Math.random()*2; // 0 - 1
      randomNum +=  1; // 1-2
        switch ((int)randomNum) {
            case 1:
                computerChoice = "rock" ;
                break;
            case 2:
                computerChoice = "paper" ;
                break;
            case 3:
                computerChoice = "scissors" ;
                break;
            default:
                computerChoice = "Error";
                break;
        }
      
      return computerChoice;
        
}
  
}
