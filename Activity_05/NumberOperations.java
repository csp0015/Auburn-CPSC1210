/**
This class will hold an integer value and provide multiple methods to perform 
various operations on that value.

@author Christian Polka
@version 06/23/2021
*/

public class NumberOperations {

   private int number;

/**
This constructor takes in an in parameter called numbersIn.
@param numberIn used.
*/
   public NumberOperations(int numberIn) {
      number = numberIn;
   
   }

/**
This method takes no paramaters and returns an int value.
@return method used.
*/
   public int getValue() {
   
      return number; 
   }

/**
This method takes no parameters and returns a String value.
@return method used.
*/
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += (i + "\t");
         
         }
         i++;
      }
      return output; 
   }

/**
This method takes no parameters and returns a String value.
@return method used.
*/
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += (powers + "\t");
         powers *= 2;
      
      }
      return output;
   }

/**
This method takes in an int parameter called compareNumber and returns an int.
@return method used.
@param compareNumber used.
*/
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }

/**
This method takes no parameters and returns a String value.
@return method used.
*/
   public String toString() {
   
      return (number + ""); 
   }






}