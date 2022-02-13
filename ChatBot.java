/*
 * A chatbot is an application that talks to the user. 
 * Iam going to build an app that carries a simple conversation
 * 
 */
package chatbot;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class ChatBot {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      //ask for user name
      System.out.println("Hello , What is your name ?");
      String username=in.nextLine();
        //ask for user city
      System.out.println("\nHi ,"+username+" Iam a JavaBot ! Where are you from ?");
      String city =in.nextLine();
        //ask for user age
      System.out.println("\nI heared thet "+city+" is beatiful ciry ! Iam from a place called Oracle"
              + "\nHow old are you ?");
      int age=(int)in.nextDouble();
       System.out.println("\nSo you are "+age+" ,Cool! Iam 400 years old."
               + "\nThis means Iam "+(400/age)+" Times older than you.\nEnough about me. What is your favorite language ?(Just Do Not Say Python)"); 
       //ask user for his/her favorite language
       in.nextLine();
       String favoriteLanguage =in.nextLine();
       //end the chat 
       System.out.println("\n"+favoriteLanguage+", That is Great ! Nice Chatting with you "+username+" I have to Log Off now. See ya !");
        in.close();
    }
    
}
