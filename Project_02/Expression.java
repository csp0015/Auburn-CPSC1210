import java.util.Scanner;

/** This program will find the result of a specified expression after
reading input values for x and y.

@author Christian Polka
@version 6/6/2021
*/



public class Expression {
 /** Asks users to input variables for calculation.

@param args command line arguments (not used).
*/

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x, y;
      
      System.out.println("result = (10x + 32.6) (5y - 1.567) / xy");
      
   
   //Prompt user to input value for x
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      
      //Prompt user to input value or y
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
      
      if (x * y == 0) {
      
         System.out.println("result is \"undefined\"");
      }
      else {
         System.out.println("result = " 
            + ((10 * x + 32.6) * (5 * y - 1.567)) / (x * y));
      }
      
   
   }


}

