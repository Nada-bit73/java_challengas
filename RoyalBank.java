
package dealership;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class  RoyalBank {
/*you work for the Royal Bank of Java. Your job is to approve customers for a loan if they:

Have $10,000 in their savings account.

Have less than $5,000 in credit card debt.

Have worked for more than 2 years.

The user will also need to provide their name.

Your task is to scan for values and use if-else to control how these statements print.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("****ROYAL BANK OF JAVA****"
                + "\nAre you here to get a mortgage? (yes or no)");
        String answer = in.next();
        
        if(answer.equals("yes")){
            System.out.println("\nGreat!\nHow much money do you have in your savings?");
         double saving = in.nextDouble();
         System.out.println("how much do you owe in credit card debt?");
         double creditCardDebt = in.nextDouble();
         System.out.println("\nHow many years have you worked for?");
         double yearsOfExperiance = in.nextDouble();
         System.out.println("What is your name?");
         in.nextLine();
         String username=in.nextLine();
               checkData(saving,creditCardDebt,yearsOfExperiance,username);
       
        }else{
            System.out.println("\nOK. Have a nice day!");
        }
        
        in.close();
       
    }
    public static void checkData(double saving,double creditCardDebt,double yearsOfExperiance,String username){
        
        if(saving >= 10000 && creditCardDebt < 5000 && yearsOfExperiance >= 2){
            System.out.println("Congratulations "+username+", you have been approved!");
        }else{
            System.out.println("Sorry, you are not eligible for a mortgage");
        }
         
         
         
    }
    
}
