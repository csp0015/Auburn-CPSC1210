import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
Creating an EllipsoidListAppp class with a main method that reads in the name
of the data file entered by the user, and reads list name and Ellipsoid data
from the file, creates Ellipsoid objects storing them in a local ArrayList
of Ellipsoid objects; and finally creates and ElliposidList object with the
name of the list and the ArrayList of Ellipsoid objects.

@author Christian Polka
@version 06/26/2021
*/

public class EllipsoidListApp {

/**
This main method will prompt the user to enter a file name, and the method
should read in the data file.
@param args command line not used.
@throws FileNotFoundException required by Scanner for file.
*/

   public static void main(String[] args) throws FileNotFoundException {
   
      ArrayList<Ellipsoid> listOfEllipsoids = new ArrayList<Ellipsoid>();
   
      Scanner scanInput = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scanInput.nextLine();
   
   
      Scanner scanFile = new Scanner(new File(fileName));
   
      String ellipsoidListName = scanFile.nextLine();
   
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         String a = scanFile.nextLine();
         String b = scanFile.nextLine();
         String c = scanFile.nextLine();
         
         double axisA = Double.parseDouble(a);
         double axisB = Double.parseDouble(b);
         double axisC = Double.parseDouble(c);
      
         Ellipsoid listMule = new Ellipsoid(label, axisA, axisB, axisC);
         listOfEllipsoids.add(listMule);
      
      
      }
      scanFile.close();
   
      EllipsoidList ellipsoidList = 
         new EllipsoidList(ellipsoidListName, listOfEllipsoids);
   
      System.out.println("");
      System.out.println(ellipsoidList.toString());
      System.out.println("");
      System.out.print(ellipsoidList.summaryInfo());
   }

}