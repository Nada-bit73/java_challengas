/*
 * My name is <name>. I'm <age> years old, and I'm from <country>.
 * My favorite sport is <sport>. I play for <hours> hour(s) a day
 * When I'm tired, I like to play <game>.
 * In school, my favourite subject was <subject>. I scored a <grade>.
 * 
 * 
 */
package scoreboard;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class Biography  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //pat 1:collect data from user
       System.out.println("Hi, Please answer the following questions to get your own Biography !");
       System.out.println("What is your name ?");
       String name =in.next();
       System.out.println("How old are you ?");
       int age =in.nextInt();
       System.out.println("Where are you from ?");
       String country =in.next();
       System.out.println("What is your favorite sport ?");
       String sport =in.next();
       System.out.println("How many Hours do you play "+sport+" a day ?");
       double playingHours =in.nextDouble();
       System.out.println("When you are not feeling your best , what do you play ?");
       String tierdMoodeGame =in.next();
       System.out.println("What do you think the most interesting subject in school ?");
       String subject =in.next();
       System.out.println("What is your Grade in "+subject+" ?");
       char grade =in.next().charAt(0);
        in.close();
       //part 2: Dispaly User’s Biography
      
       System.out.println("Great That is All We Need !\nYour Biography :");
       System.out.println("My name is "+name+" ,I'm "+age+" years old, and I'm from "+country);
       System.out.println("My favorite sport is "+sport+". I play for "+playingHours+"hour(s) a day");
       System.out.println("When I'm tired, I like to play "+tierdMoodeGame+".");
       System.out.println("In school, my favourite subject was "+subject+". I scored a "+grade+".");
       

    }
    
}
