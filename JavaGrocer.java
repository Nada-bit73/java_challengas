
package exam;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class JavaGrocer {

   
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        String[] menu = {"apples" , "bananas" , "candy" , "chocolate" , "coffee" , "tea"};
        
        System.out.println("What can I get you ?");
        String customerRequest  = in.nextLine();
        boolean isAvailable = false ; 
        for(int i=0;i<menu.length;i++){
            
          if (customerRequest.equals(menu[i])){
       
              System.out.println("\nWe have that in aisle: "+i);
              isAvailable = true ; 
          } 
        
        }
        
       if(! isAvailable){
           System.out.println("\nSorry "+customerRequest+" is not available ");
       } 
       
        
        
    }
    
}
