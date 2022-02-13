/*
 * I will develop an app called Ask Java.
 * The user can ask questions and Java needs to reply: true or false
 * 
 * 
 */
package askjava;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class AskJava {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //task 1 : buy chips 
        System.out.println("Nada: Hi Java,I want to buy chips");
        System.out.println("Java: Hi Nada,How much change do you have ?");
        double userChange = in.nextDouble();
        buyChips(userChange);
        
        //task 2 : elevator capacity 
        System.out.println("\nNada: Hi Java,can the elevator hold everyone?");
        System.out.println("Java: Hi Nada,Please enter the number of people");
        int numOfPeople = in.nextInt();
        elevatorCapacity(numOfPeople); 
    }
    
    //calculate the chips price
    public static void buyChips(double userMoney){
        double priceOfChips = 2.50; 
        if(userMoney >= priceOfChips){
            System.out.println(userMoney+"$ is Enough ,Thank you");
        }else{
           System.out.println(userMoney+"$ is Not Enough ,Sorry");
        }
    }
    //calculate the elevator capacity 
   public static void elevatorCapacity(int numOfPeople){
       int capacity =12;
       if(numOfPeople <= capacity){
        System.out.println(numOfPeople+" is Ok you all can enter");
       }else{
            System.out.println(numOfPeople+" is Too much for the elevator capacity");
       }
       
   }
    
}
