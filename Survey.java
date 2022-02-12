/*
 * 
 * Create Survey , store the answers 
 * then view the answers !
 */
package survey;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class Survey {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hi ,What Is Your Name ?");
        String userName = in.next();
        System.out.println("How Much Mony Do You Spend On Coffee ?");
        double coffeeMoney = in.nextDouble();
        System.out.println("How Much Mony Do You Spend On Fast Food ?");
        double fastFoodMoney = in.nextDouble();
        System.out.println("How Many Times A Week Do You Buy Coffee ?");
        int coffeeCounter = in.nextInt();
        System.out.println("How Many Times A Week Do You Buy A Fast Food ?");
        int fastFoodCounter = in.nextInt();
        //Dispaly the conclusion
        System.out.println("Thank You "+userName+" For Answering All The Questions!");
        //call measureTheDifference to do the calculations 
        measureTheDifference(coffeeCounter,fastFoodCounter,coffeeMoney,fastFoodMoney);
        
    }
    public static void measureTheDifference(int coffeeCounter,int fastFoodCounter,double coffeeMoney,double fastFoodMoney){
         double coffeePersentage = coffeeCounter - fastFoodCounter;
         double fastFoodPersentage = fastFoodCounter - coffeeCounter;
         double coffeeWeeklyPrice = coffeeMoney*coffeeCounter;
         double fastFoodWeeklyPrice = fastFoodCounter *fastFoodMoney;
        //max is coffee
      if(coffeeCounter > fastFoodCounter){
            System.out.println("The Result is :\nYour Coffee Expenses Are "+coffeePersentage+" Times Your Fast Food Exprnses, This Lines Up Weekly,"
               + "\nYou Spent "+coffeeWeeklyPrice+
             "$ On Coffee Weekly,\nWhile You Spent "+fastFoodWeeklyPrice+"$ On Fast Food Weekly.");
            //max is fast food
      }else if(coffeeCounter < fastFoodCounter){ 
             System.out.println("The Result is :\nYour Fast Food Expenses Are "+fastFoodPersentage+" Times Your Coffee Exprnses, This Lines Up Weekly,"
               + "\nYou Spent "+fastFoodWeeklyPrice+"$ On Fast Food Weekly,\nWhile You Spent "+coffeeWeeklyPrice+"$ On Coffee Weekly.");
      }else{
           System.out.println("The Result is :\nYou Spent Same Amount Of Money For The Coffee And The Fast Food ! \n"
                   + "That Is "+coffeeWeeklyPrice+"$ for Coffee Weekly and "+fastFoodWeeklyPrice+"$ for Fast Food Weekly . ");
      }  
    }
    
}
