import java.util.Scanner;

/**
Class that contains a main method that reads in values 
for label and the axes a, b, and c. After the values 
have been read in, the main method creates an Ellipsoid
object and then prints a new line and the object.

@author Christian Polka
@version 06/19/2021
*/

public class EllipsoidApp {

/**
Main method that reads in values for label and the
three axes.

@param args command line not used.
*/

   public static void main(String[] args) {
   
      String label = "";
      String trimLabel;
      String a;
      String b;
      String c;
      double axisA = 0;
      double axisB = 0;
      double axisC = 0;
      Scanner userInput = new Scanner(System.in);
      
   
      System.out.println("Enter label and axes a, b, c for an ellipsoid.");
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      trimLabel = label.trim();
      System.out.print("\ta: ");
      a = userInput.nextLine();
      axisA = Double.parseDouble(a);
      if (axisA <= 0) {
         System.out.print("Error: axis value must be positive.");
         return;
      }
      System.out.print("\tb: ");
      b = userInput.nextLine();
      axisB = Double.parseDouble(b);
      if (axisB <= 0) {
         System.out.print("Error: axis value must be positive.");
         return;
      }
      System.out.print("\tc: ");
      c = userInput.nextLine();
      axisC = Double.parseDouble(c);
      if (axisC <= 0) {
         System.out.print("Error: axis value must be positive.");
         return;
      }
      
      Ellipsoid userEllips = new Ellipsoid(trimLabel, axisA, axisB, axisC);
      userEllips.volume();
      userEllips.surfaceArea();
      System.out.println("\n" + userEllips.toString());
   
   }

}