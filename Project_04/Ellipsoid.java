import java.text.DecimalFormat;

/**
This program is used to create and elipsoid class and define the
elements that make up an ellipsoid.

@author Christian Polka
@version 06/19/2021
*/

public class Ellipsoid {


/**
Creating the instance variables, constructors, and methods that will
be used in this class.

*/
   
// Instance variables
   private String label = "";
   private double axisA = 0, axisB = 0, axisC = 0;

   
   //Constructors
   
   /**
   Sets a constructor for setA.
   @param axisAIn argument used.
   @return argument used.
   */
   
   public boolean setA(double axisAIn) {
      boolean isASet = false;
      if (axisAIn > 0) {
         axisA = axisAIn;
         isASet = true;
      }
      return isASet;
      
   }
   
   /**
   Sets a constructor for setB.
   @param axisBIn argument used.
   @return argument used.
   */
   
   public boolean setB(double axisBIn) {
      boolean isBSet = false;
      if (axisBIn > 0) {
         axisB = axisBIn;
         isBSet = true;
      }
      return isBSet;
   }
   
   /**
   Sets a constructor for setB.
   @param axisCIn argument used.
   @return argument used.
   */
   
   public boolean setC(double axisCIn) {
      boolean isCSet = false;
      if (axisCIn > 0) {
         axisC = axisCIn;
         isCSet = true;
      }
      return isCSet;
   }
   
   /**
   Sets constructor for setLabel.
   @param labelIn argument used.
   @return argument command used.
   */
   
   public boolean setLabel(String labelIn) {
      boolean labelSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         labelSet = true;
      }
      return labelSet;
   }
   
   /** 
   Sets the according value for each param.
   @param labelIn argument used.
   @param axisAIn argument used.
   @param axisBIn argument used.
   @param axisCIn argument used.
   */
   
   public Ellipsoid(String labelIn,
      double axisAIn, double axisBIn, double axisCIn) {
      setA(axisAIn);
      setB(axisBIn);
      setC(axisCIn);
      setLabel(labelIn);
   }
   
   /**
   Get method for the String label.
   @return argument used.
   */
   
   public String getLabel() {
      return label;
   }
   
   /**
   Get method for axisA.
   @return argument used.
   */
   
   public double getA() {
      return axisA;
   }
   
   /**
   Get method for axisB.
   @return argument used.
   */
   
   public double getB() {
      return axisB;
   }
   
   /**
   Get method for axisC.
   @return argument used.
   */
   
   public double getC() {
      return axisC;
   }
   
   /**
   Method to calculate the volume
   based on the set axis.
   @return argument used.
   */
   
   public double volume() {
   
      double volume = (4 * Math.PI * axisA * axisB * axisC) / 3;
      return volume;
   }
   
   /**
   Method to calculate the surface area of an ellipsoid.
   @return argument used.
   */
   
   public double surfaceArea() {
   
      double surfaceArea = Math.pow((Math.pow((axisA * axisB), 1.6)
         + Math.pow((axisA * axisC), 1.6)
         + Math.pow((axisB * axisC), 1.6)) / 3, (1 / 1.6)) * 4 * Math.PI;
      return surfaceArea;
   }
   
   /**
   toString method to print output of methods.
   @return argument used.
   */
   
   public String toString() {
   
     
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      String output = "Ellipsoid " + "\"" + label + "\" "
         + "with axes a = " + df.format(axisA) + ", " + "b = " 
         + df.format(axisB) + ", "
         + "c = " + df.format(axisC) + " units has:" + "\n";
      output += "\tvolume = "
         + df.format((4 * Math.PI * axisA * axisB * axisC) / 3) + " cubic units"
         + "\n";
      output += "\tsurface area = " 
         + df.format(Math.pow((Math.pow((axisA * axisB), 1.6)
         + Math.pow((axisA * axisC), 1.6)
         + Math.pow((axisB * axisC), 1.6)) / 3, (1 / 1.6)) * 4 * Math.PI) 
         + " square units";
         
      return output;
   }
   
   
  
}