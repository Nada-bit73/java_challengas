/*
 * The Goal is to apply selectors
 */
package dealer_ship;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class Dealer_ship {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //select buy or sell
        System.out.println("Welcome, to the Java Dealership"
                + "\n. Select option 'a' to BUY a car "
                + "\n. Select option 'b' to SELL a car");
        char selectedOption = in.next().charAt(0);
        //check data
        switch(selectedOption){
            case 'a':
                System.out.println("What is your budget ?");
                double budget = in.nextDouble();
                //step 1 : check budget is enough
                if(budget >= 10000){
                    System.out.println("Great ! a Nissan Altima is available");
                    //step 2:check insurance ,license and credit score 
                    System.out.println("\nDo you have insurance ? enter 'yes' or 'no' :");
                    in.nextLine();
                    String insurance = in.nextLine();
                    System.out.println("\nDo you have a license ? enter 'yes' or 'no' :");
                    String license = in.nextLine();
                    System.out.println("\nWhat is your credit score ?");
                    int creditScore = in.nextInt();
                    //valid data 
                    if(insurance.equals("yes") && license.equals("yes") && creditScore > 660 ){
                        System.out.println("\nSold , Pleasure doing bussines with you !");
                    //invalid data    
                    }else{
                        System.out.println("\nWe are sorry , you are not eligible");
                    }
                    //budget not enough 
                }else{
                    System.out.println("We do not sell cars under $10,000 Sorry.");
                }
                break;
                //sell case
            case 'b':
                //check the price of the car
                   System.out.println("\nWhat is your car valued at ?");
                   int carValue = in.nextInt();
                   System.out.println("\nWhat is your selling price ?");
                   double sellPrice = in.nextDouble();
                   //valid data
                   if(carValue > sellPrice && sellPrice < 30000){
                       System.out.println("\nCongrats ! we will buy your car ,Pleasure doing bussines with you !");
                       //invalid data
                   }else {
                       System.out.println("\nSorry , we are not interested");
                   }
                   break;
                   //option not a nor b
            default:    
                   System.out.println("This is invalid option, Try Again !");
        }
        
        
    }
    
}
