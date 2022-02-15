/*
 * This game require 2 tasks :
 * Roll the Dice
 * check wining
 */
package dicejack;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class DiceJack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //step1 : enter 3 integers by user
        System.out.println("Please Enter three numbers between 1 and 6 ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        //check that (1 <  values > 6)
        if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("The numbers can not be less than 1 , shutting the game down ...");
            System.exit(0);
        }
        if(num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("The numbers can not be greater than 6 , shutting the game down ...");
            System.exit(0);
        }
        in.close();
        
        //generate 3 randomes btw 0 and 6
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        
        
        int sumOfNumbers = num1 + num2 + num3 ;
        int sumDiceRolls = roll1 + roll2 + roll3 ;
        System.out.println("Dice sum  "+sumDiceRolls+", Number sum "+sumOfNumbers);
        
        //print the result 
        if(checkWin(sumOfNumbers,sumDiceRolls)){
            System.out.println("Congrats You Win !");
        }else{
           System.out.println("Sorry , Try Again");

        }
    }
    
    public static int rollDice(){
        double randomNumber =  Math.random() * 6; // btw 0 and 6
        //since the numbers must not be 0 
        randomNumber += 1; // range btw 1 - 6 
        return (int) randomNumber;
    }
    
    /*user win if :
    * 1.sumDiceRolls is less than sumOfNumbers
    * 2. the diff btw two numbers < 3
    * notice that : the function must do 1 task as its name said !!!!
    */
    public static boolean checkWin(int sumDiceRolls, int sumOfNumbers){
        
        return(sumDiceRolls > sumOfNumbers && (sumDiceRolls - sumOfNumbers) < 3);
    }
}
