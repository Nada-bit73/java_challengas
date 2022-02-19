/*
 * the user is ordering a pizza. Your app will ask the user what toppings they want before dispatching a driver.
 */
package pizzadelivery;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class PizzaDelivery {

    public static void main(String[] args) {
        // Task 1: Ask the user: How many pizza toppings do you want?. Then, pick up the result using Scanner.
Scanner in = new Scanner(System.in);
System.out.println("Java Pizza Delivery\nHow many pizza toppings do you want?");
int numberOfTopping = in.nextInt();
in.nextLine();

//Task 2: Create a String[] array toppings that can store the number of toppings requested.
String[] toppings = new String[numberOfTopping];

System.out.println("Great, enter each topping!");
for(int i =0 ; i < toppings.length ; i++){
    System.out.print(i+". ");
    toppings[i] = in.nextLine();
}

System.out.println("\nThank you! Here are the toppings your ordered\n");
for(int i =0 ; i < toppings.length ; i++){
    System.out.println(i+". "+toppings[i] );
    
}

System.out.println("\nPress anything to confirm your order.");

String comfirm = in.nextLine();
System.out.println("\nGreat, a driver is on the way!\n");


    }
    
}
