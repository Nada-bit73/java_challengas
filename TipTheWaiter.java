/*
 * The bill was $53.50. It's customary to tip the waiter 15% of your bill.
 * 
 */
package tipthewaiter;

/**
 *
 * @Nada
 */
public class TipTheWaiter {

    public static void main(String[] args) {
    tipTheWaiter(53.50);
    }
    //calculates a tip and prints it.
    public static void tipTheWaiter(double bill){
        //1. Calculates a tip that's 15 percent of the bill you paid.
       //2. Prints: your service was wonderful! Please, accept this tip.
       
       double tip = ( bill / 100 ) * 15;
       System.out.println("your service was wonderful! Please, accept this tip ,$"+ tip);
    }
    
}
