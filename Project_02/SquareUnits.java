import java.util.Scanner;
/**
This program will calculate the integral number of units
(acres, square yards, and square feet) in a specified number
of square inches.

@author Christian Polka
@version 6-6-2021
*/




public class SquareUnits {
/** Method to convert a user input number for square inches. 

@param args command line arguments (not used).
*/ 

 
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      int inches;
      int difference;
     
      
      //Prompt user to enter area in square inches
      System.out.print("Enter the area in square inches: ");
      inches = userInput.nextInt();
      
      //output for inputs at or over 1000000000
      if (inches >= 1000000000) {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
      }
      //output for inputs under 1000000000
      else {
       
         System.out.println("Number of Units: ");
         System.out.println("\tAcres: " + inches / 6272640);
         difference = inches % 6272640; 
         System.out.println("\tSquare Yards: " + difference / 1296);
         difference %= 1296;
         System.out.println("\tSquare Feet: " + difference / 144);
         difference %= 144;
         System.out.println("\tSquare Inches: " + difference);
      
      
      }
   
   
   }

}