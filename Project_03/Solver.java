import java.text.DecimalFormat;
import java.util.Scanner;
/**
Program to solve for a specific expression from user input.
 Next this program will detrmine the number of characters 
 to the left and to the right of the decimal point.
 
 @author Christian Polka
 @version 06/12/2021
 */
 
public class Solver {
 /**
 Main method to run the program.
 
 @param args command line not used.
 */
 
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.0####");
      int leftResult, rightResult, placeDecimal, lengthResult;
      double result, resultNumerator, resultDenominator, xDouble;
      String resultString;
   
   
   // Prompts user to enter a value for x
      System.out.print("Enter a value for x: ");
      xDouble = Double.parseDouble(userInput.nextLine());
      
   // Calculate the numerator of the expression
      resultNumerator = Math.sqrt(Math.abs(11 * Math.pow(xDouble, 4.0) 
         + 9 * Math.pow(xDouble, 3.0) + 7 * Math.pow(xDouble, 2.0) 
         + 5 * Math.pow(xDouble, 1) + 4));
      
   // Calculate the denominator of the expression
      resultDenominator = 2 * xDouble + 4;
   
   // Get final result
      result = resultNumerator / resultDenominator;
   
      System.out.println("Result: " + result);
      
      // Convert result to a string
      resultString = Double.toString(result);
      
      // Finds index of decimal
      placeDecimal = resultString.indexOf('.') + 1;
      
      // Finds length of result
      lengthResult = resultString.length();
      
      // Finds length to the left of the decimal
      leftResult = placeDecimal - 1;
      
      // Finds length to the right of the decimal
      rightResult = lengthResult - placeDecimal;
      
      // Format output
      System.out.println("# of characters to left of decimal point: " 
         + leftResult);
      System.out.println("# of characters to right of decimal point: " 
         + rightResult);
      System.out.print(" Formatted Result: " + df.format(result));
      
      
      
      
      
   
   
   
   }
 
 
 
}