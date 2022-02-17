/*Set up an if - else if - else statement.

if the number is a multiple of three, mark it: Fizz.

if the number is a multiple of five, mark it: Buzz.

if the number is a multiple of three and five, mark it: FizzBuzz.*/
package fizzbuzz;

/**
 *
 * @Nada
 */
public class FizzBuzz {

    public static void main(String[] args) {
        //1.Make a for loop that counts from 0 to 18 and print each number.
        for(int i = 0 ; i <= 18 ; i++){

if(i % 3 == 0 && i % 5 == 0){
    System.out.println(i+ " FizzBuzz");
}else if(i % 5 == 0){
    System.out.println(i+ " Buzz");

}else if(i % 3 == 0 ){
    System.out.println(i+ " Fizz");
}
            
        }
    }
    
}
