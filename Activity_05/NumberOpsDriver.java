import java.util.Scanner;
import java.util.ArrayList;

/**
 * Demonstrates the NumberOperations class.
 */
public class NumberOpsDriver {

   /**
    * Reads a set of positive numbers from the user until the user enters 0.
	 * Prints odds under and powers of 2 under for each number.
	 *
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) {
   	
      Scanner in = new Scanner(System.in);
      
      // declare and instantiate ArrayList with generic type <NumberOperations>
      ArrayList<NumberOperations> numOpsList 
            = new ArrayList<NumberOperations>();
      
      // prompt user for set of numbers
      System.out.println("Enter a list of positive integers separated "
                        + "with a space followed by 0:");
   
      int userInput = in.nextInt();
      while (userInput != 0) {
         NumberOperations userConversion = new NumberOperations(userInput);
         numOpsList.add(userConversion);
         userInput = in.nextInt();
      
      }
      
      
      int index = 0;
      while (index < numOpsList.size()) {
         NumberOperations num = numOpsList.get(index);
         System.out.println("For: " + num);
         System.out.println("\tOdds under: " + num.oddsUnder());
         System.out.println("\tPowers of 2 under:\t" + num.powersTwoUnder());
            
         index++;
      }
   }
}