
package evenorodd;

/**
 *
 * @Nada
 */
public class EvenOrOdd {

    public static void main(String[] args) {
       //1.Make a for loop that counts from 0 to 19.
       for(int i = 0 ; i < 20 ; i++){
         //2.Using an if - else statement, mark each number as even or odd.
         if(i % 2 == 0){
             System.out.println(i+" Even");
         }else{
              System.out.println(i+" Odd");
         }
           
       }
    }
    
}
