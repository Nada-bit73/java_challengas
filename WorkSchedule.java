
package workschedule;

/**
 *
 * @Nada
 */
public class WorkSchedule {
/*1 is saturday and 2 is friday (weekend in KSA) */
    public static void main(String[] args) {
           int day = 2;
           
          switch(day){
              case 1:
              case 2: 
                  System.out.println("it's the weekend, no work!");
                  break;
              default: 
                  System.out.println("Wake up at 7:00 :(");
          }
    }
    
}
