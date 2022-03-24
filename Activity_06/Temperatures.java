import java.util.ArrayList;

/**
Temperatures class created to hold a set of integer values
representing daily temperatures.

@author Christian Polka
@version 6/30/2021
*/

public class Temperatures {

   private ArrayList<Integer> temperatures = new ArrayList<Integer>();

/**
Constructor method that takes an input parameter of an ArrayList.
@param temperaturesIn argument used.
*/
   public Temperatures(ArrayList<Integer> temperaturesIn) {
   
      temperatures = temperaturesIn;
   }

/**
Get method that returns an integer value of the lowest temp in
the ArrayList.
@return function used.
*/
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      else {
         int low = temperatures.get(0);
         for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) < low) {
               low = temperatures.get(i);
            }
         }
         return low;
      }
   
   }

/**
Get method that returns an integer value of the highest temp in 
the ArrayList.
@return function used.
*/
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      else {
         int high = temperatures.get(0);
         for (Integer temp : temperatures) {
            if (temp > high) {
               high = temp;
            }
         }
         return high;
      }
   
   }
/**
Method that takes an int parameter and returns an int value of the lowest
temp value.
@return method used.
@param lowIn argument used.
*/
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
/**
Method that takes an int parameter and returns an int value of the highest
temp value.
@return method used.
@param highIn argument used.
*/
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
/**
Method that converts data into a String for the user to understand.
@return method used.
*/
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   
   }
   
}