
package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @Nada
 */
public class TicTacToe {
     
  
    public static void main(String[] args) {
        char[][] board = {
            {'-','-','-'},
            {'-','-','-'},
            {'-','-','-'}
        };
        
        
        printBoard(board);
        
      
           for(int i = 0 ; i < 9 ; i++){
                if(checkWin(board) == 0){
        //x turn firest --> even number (x),odd number (o)
          if(i % 2 == 0){
            System.out.println("Turn: X");
            write(board,askUser(board),'X'); 
          
        }else{
            System.out.println("Turn: O");
            write(board,askUser(board),'O');
        }
          
          
        }if(checkWin(board) == 1){
            System.out.println("Thank you for playing with java!!");
            break;
        }
        }
      
             
        
     
       
    }
    /**
 * Function name - printBoard()
 * @param board (char[][])
 *
 * Inside the function:
 *   1. print a new line.
 *   2. print the board.
 *    - separate each row by two lines.
 *    - each row precedes a tab of space
 *    - each character in the grid has one space from the other character
  */
    
    public static void printBoard(char[][] board){
        System.out.println("^Java Tic Tac Toe^\n\nLets play Tic Tac Toe\n\n");
       
             for(int i = 0 ; i < board.length ; i++){
            System.out.print("     ");
                 for(int j = 0 ; j < 3 ; j++){
              
                 System.out.print( board[i][j] + " " );
        } 
                    System.out.println("\n");

          
        }
             
    }
    
    //The maximum number of turns is 9. Set up a for loop that runs 9 times and prints the counter.



/**
 * Function name -- askUser 
 * @param board (char[][] board)
 * @return spot (int[])
 *
 * Inside the function
 *     1. Asks the user: - pick the row and column:
 *     2. If the spot is taken, ask the user to choose again.
 *     3. Return the row and column in an int[] array.
 *
 */

public static int[] askUser﻿(char[][] board){
    Scanner in = new Scanner(System.in);
    System.out.print("pick the row and column: ");
     int raw = in.nextInt();
     int col = in.nextInt();
    System.out.print("\n");
    int[] spot = {raw,col};
    return spot;
    
}


public static void write(char[][] board , int[] spot,char symbol){
    Scanner in = new Scanner(System.in);
    int row = spot[0];
    int column = spot[1];
    
    while(board[row][column] == 'X' || board[row][column] == 'O'){
       
        System.out.print("This spot is already taken ! Try again ");
        row = in.nextInt();
        column = in.nextInt();
        
    } 
    
         board[row][column] = symbol;
          
         printBoard(board);
    }
         
        
   /**
 * Function name - checkWin 
 * @param board (char[][])
 * @return count (int)
 *
 * Inside the function:
 *   1. Make a count variable that starts at 0.
 *   2. Check every row for a straight X/O  
 *   3. Check every column for a straight X/O 
 *   4. Check the left diagonal for a straight X/O  
 *   5. Check the right diagonal for a straight X/O  
 */
public static int checkWin(char[][] board){
   int count = 0;
   
    if(board[0][0] == 'X'&& board[0][1] == 'X' && board[0][2] == 'X'){
        System.out.println("X wins");
        
        count++;
    }
     
      
   
  else if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O'){
        System.out.println("O wins");
           count++;
    }
    
    
  else  if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X'){
        System.out.println("X wins");
         count++;
      
    }
  else  if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O'){
        System.out.println("O wins");
          count++;
       
    }
    
  else  if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X'){
        System.out.println("X wins");
         count++;
      
    }
  else  if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O'){
        System.out.println("O wins");
          count++;
      
    }
    
    
   else if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'){
        System.out.println("X wins");
          count++;
       
    }
   else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){
        System.out.println("O wins");
          count++;
       
    }
    
  else  if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'){
        System.out.println("X wins");
          count++;
       
    }
  else  if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'){
        System.out.println("O wins");
          count++;
       
    }
    
 else   if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X'){
        System.out.println("X wins");
          count++;
        
    }
 else   if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'){
        System.out.println("O wins");
          count++;
    }
    
 else   if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X'){
        System.out.println("X wins");
          count++;
    }
 else   if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'){
        
        System.out.println("O wins");
          count++;
    }
    
 else   if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X'){
        System.out.println("X wins");
          count++;
    }
 else   if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O'){
        System.out.println("O wins");
         count++;
       
    }
    
  
         return count;
}
    
    
    
    
}
    

