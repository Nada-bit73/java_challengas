
package lotterytickets;

import java.util.Arrays;

/**
 *
 * @Nada
 */
public class LotteryTickets {

    public static void main(String[] args) {
        int[] ticket = {34 , 43 , 45 , 65 , 21 , 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;
        printTicketNumbers(ticket , 1);
        printTicketNumbers(ticket2 , 2);

    }
    
     public static void printTicketNumbers(int[] ticket ,int ticketNum){
     
     String ticketOfUser = Arrays.toString(ticket);
     System.out.println("Ticket "+ticketNum +" Numbers : "+ticketOfUser +"\n");
 }   
}
