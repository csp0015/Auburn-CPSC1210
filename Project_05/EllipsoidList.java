import java.util.ArrayList;
import java.text.DecimalFormat;

/**
This class is called the EllipsoidList class. This class will store
the name of the list and an ArrayList of ellipsoid objects.
This class will also include methods that return the name of the list,
number of Ellipsoid objects in the EllipsoidList, total volume, total
surface area, average volume, and average surface for all Ellisoid
objects in the EllipsoidList.

@author Christian Polka
@version 06/25/2021
*/

public class EllipsoidList {

   private String ellipsoidListName;
   private ArrayList<Ellipsoid> eList = new ArrayList<Ellipsoid>();
 
/**
This constructor takes in a string paramater and an ArrayList with
type Ellipsoid.
@param listName used.
@param listInput listInput used.
*/

   public EllipsoidList(String listName, ArrayList<Ellipsoid> listInput) {
      ellipsoidListName = listName;
      eList = listInput;
   
   }
   
   /**
   This method returns a String representing the name of EllipsoidList.
   @return argument used.
   */
   
   public String getName() {
   
      return ellipsoidListName;
   }
   
   /**
   Returns an int representing the number of Ellipsoid objects in the 
   EllipsoidList.
   @return function used.
   */
   
   public int numberOfEllipsoids() {
      if (eList.size() == 0) {
         return 0;
      }
      else {
         return eList.size();
      }
   
   }
   
   /**
   Returns a double representing the total volume for all Ellipsoid objects
   in the list.
   @return function used.
   */
   
   public double totalVolume() {
      int index = 0;
      Ellipsoid volumeEllipsoid;
      double volumeE = 0;
      if (eList.size() == 0) {
         volumeE = 0;
      }
      
      else {
         while (index < eList.size()) {
            volumeEllipsoid = eList.get(index);
            volumeE += volumeEllipsoid.volume();
            index++;
         }
      
      }
      return volumeE;
   
   }
   
   /**
   Returns a double representing the total surface area for all Ellipsoid
   objects in the list.
   @return function used.
   */
   
   public double totalSurfaceArea() {
   
      int index = 0;
      Ellipsoid totalSAEllipsoid;
      double surfaceAreaE = 0;
      if (eList.size() == 0) {
         surfaceAreaE = 0;
      }
      else {
         while (index < eList.size()) {
            totalSAEllipsoid = eList.get(index);
            surfaceAreaE += totalSAEllipsoid.surfaceArea();
            index++;
         }
      
      }
      return surfaceAreaE;
   }
   
   /**
   Returns a double representing the average volume for all Ellipsoid
   objects in the list.
   @return function used.
   */
   
   public double averageVolume() {
      int index = 0;
      Ellipsoid volumeEllipsoid;
      double volumeE = 0;
      double totalE = eList.size();
      if (eList.size() == 0) {
         volumeE = 0;
      }
      
      else {
         while (index < eList.size()) {
            volumeEllipsoid = eList.get(index);
            volumeE += volumeEllipsoid.volume();
            index++;
         }
      
      }
      if (eList.size() == 0) {
         return volumeE;
      }
      else {
         return (volumeE / totalE);
      }
   
   }
   
   /**
   Returns a double representing the average surface area for all
   Ellipsoid objects in the list.
   @return function used.
   */
   
   public double averageSurfaceArea() {
      int index = 0;
      Ellipsoid totalSAEllipsoid;
      double surfaceAreaE = 0;
      double totalE = eList.size();
      if (eList.size() == 0) {
         surfaceAreaE = 0;
      }
      else {
         while (index < eList.size()) {
            totalSAEllipsoid = eList.get(index);
            surfaceAreaE += totalSAEllipsoid.surfaceArea();
            index++;
         }
      
      }
      if (eList.size() == 0) {
         return surfaceAreaE;
      }
      else {
         return (surfaceAreaE / totalE);
      }
   
   }
   
   /**
   Returns a String containing the name of the list followed by each
   Ellipsoid in the ArrayList.
   @return function used.
   */
   
   public String toString() {
   
      int index = 0;
      Ellipsoid ellipsoidIndex;
      String call = ellipsoidListName + "\n";
      while (index < eList.size()) {
         ellipsoidIndex = eList.get(index);
         call += "\n" + ellipsoidIndex.toString() + "\n";
         index++;
      }
      return call;
   }
   
   /**
   Returns a String containing the name of the list followed by 
   various summary items.
   @return function used.
   */
   
   public String summaryInfo() {
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + ellipsoidListName + " -----";
      output += "\nNumber of Ellipsoid Objects: " + numberOfEllipsoids();
      output += "\nTotal Volume: " + df.format(totalVolume()) + " cubic units";
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + " square units";
      output += "\nAverage Volume: " + df.format(averageVolume())
         + " cubic units";
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
         + " square units\n";
   
      return output;
   
   
   }
  

}