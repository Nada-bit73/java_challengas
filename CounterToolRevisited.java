
package countertoolrevisited;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class CounterToolRevisited {

    public static void main(String[] args) {
      //enter the loop values 
        Scanner in = new Scanner(System.in);
        System.out.print("1.Pick a number to count by:");
        int counter = in.nextInt();
        System.out.print("2.Pick a number to start counting from:");
        int startNum = in.nextInt();
        System.out.print("3.Pick a number to count to:");
        int endNum = in.nextInt();
        // print based on user input
        for(int i = startNum ; i <= endNum ; i+=counter ){
            System.out.print(i+" ");
        }
           
    }
    
}
