/*
 * create a program that allow the user to: 
 * 1. enter the number of historical figures user want to store 
 * 2.enter the data for each Figure
 * 3.print the complete Figures
 * 4.allow user to seach in Figures by the 'name' 
 */
package javapedia;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class Javapedia {

    public static void main(String[] args) {
        
        System.out.println("How many historical figures will you register?");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        
        String[][] database = new String[num][3];
       
       //add values to the database
           for(int i = 0 ; i < database.length ; i++){
               System.out.println("Figure "+(i+1)+"\n");
                int j = 0;
               while(j < 3 ){
                   
               int c = 0;
                if(c == 0){
                  System.out.print("Name : ");
                   database[i][j] = in.nextLine();
                   c++;
                   j++;
              } if(c == 1){
                  System.out.print("Date of birth : ");
                   database[i][j] = in.nextLine();
                   c++;
                   j++;
              } if (c == 2){
                  System.out.print("Occupation : ");
                  database[i][j] = in.nextLine();
                  c++;
                  j++;
              }
             
           
        } 
         
           System.out.println("\n");

          
        } 
                     
       print2DArray(database);
        System.out.println("Wh﻿o ﻿do﻿ y﻿ou want infor﻿ma﻿ti﻿on﻿ on? ");
        String nameToFind = in.nextLine();
        search(database,nameToFind);
        
    }
    
    //view the database elements
    public static void print2DArray(String[][] database){
       System.out.print("\nThese are the values you stored:\n" );
              for(int i = 0 ; i < database.length ; i++){
               System.out.println("Figure "+(i+1));
           for(int j = 0 ; j < 3 ; j++){
               int c = 0;
                if(c == 0){
                  System.out.print("Name : "+database[i][j]);
                   
                   c++;
              } if(c == 1){
                  System.out.print("\nDate of birth : "+ database[i][j]);
               
                   c++;
              }if (c == 2){
                  System.out.print("\nOccupation : "+ database[i][j]);
              }
              break;
           
        } 
           System.out.println("\n");

          
        } 
    }
    
    //search for one elment
    public static void search(String[][] database , String name){
      
        for(int i = 0 ; i < database.length ; i++){
             
                 if(database[i][0].equals(name)){
           
                  System.out.print("Name : "+database[i][0]);
                  
                  System.out.print("\nDate of birth : "+ database[i][1]);
               
                  System.out.print("\nOccupation : "+ database[i][2]);
              }else{
                     System.out.println("No match found...\n");
                     break;
                 }
              
             }
         
                   
                
               
        }
        
    }
    

