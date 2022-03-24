import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
This Class will create an EllipsoidListMenuApp the will present the user
with eight options.

@author Christian Polka
@version 07/04/2021
*/

public class EllipsoidListMenuApp {

/**
Main method to set up the eight options and read the user input to run
the program.
@param args command line not used.
@throws FileNotFoundException if file is not found.
*/

   public static void main(String[] args) throws FileNotFoundException {
   
      Scanner userInput = new Scanner(System.in);
      String eListName = "no list name";
      ArrayList<Ellipsoid> initialList = new ArrayList<Ellipsoid>();
      EllipsoidList eList = new EllipsoidList(eListName, initialList);
      String noFile = "no file name";
      String read = "";
   
   
   
      System.out.println("Ellipsoid List System Menu");
      System.out.println("\nR - Read File and Create Ellipsoid List");
      System.out.println("P - Print Ellipsoid List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add Ellipsoid");
      System.out.println("D - Delete Ellipsoid");
      System.out.println("F - Find Ellipsoid");
      System.out.println("E - Edit Ellipsoid");
      System.out.println("Q - Quit");
   
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         read = userInput.nextLine();
         if (read.length() == 0) {
            continue;
         }
         read = read.toUpperCase().trim();
         char readChar = read.charAt(0);
         switch (readChar) {
            case 'R':
               System.out.print("\tFile Name: ");
               String fileName = userInput.nextLine();
               eList = eList.readFile(fileName);
               System.out.println("\tFile read in and Ellipsoid " 
                  + "List created\n");
               break;
            case 'P':
               System.out.println(eList);
               break;
            case 'S':
               System.out.println("\n" + eList.summaryInfo());
               break;
            case 'A':
               System.out.print("\tlabel: ");
               String label = userInput.nextLine();
               System.out.print("\ta: ");
               Double sideA = Double.parseDouble(userInput.next());
               System.out.print("\tb: ");
               Double sideB = Double.parseDouble(userInput.next());
               System.out.print("\tc: ");
               Double sideC = Double.parseDouble(userInput.next());
            
               eList.addEllipsoid(label, sideA, sideB, sideC);
               System.out.println("\t*** Ellipsoid added ***\n");
               break;
            case 'D' :
               System.out.print("\tlabel: ");
               String labelCheck = userInput.nextLine();
            
               if (eList.findEllipsoid(labelCheck) == null) {
                  System.out.println("\"" + labelCheck + "\" not found\n");
               }
               else {
                  String returnValue = eList.findEllipsoid(labelCheck).getLabel();
               
                  eList.deleteEllipsoid(labelCheck);
                  System.out.println("\"" + returnValue + "\" deleted\n");
               }
               break;
            case 'F' :
               System.out.print("\tlabel: ");
               String findLabel = userInput.nextLine().trim();
               if (eList.findEllipsoid(findLabel) == null) {
                  System.out.println("\t\"" + findLabel
                     + "\" not found\n");
                     
                  break;
               }
               
               else {
                  System.out.println(eList.findEllipsoid(findLabel) + "\n");
                  break;
               }
            
            case 'E' :
               System.out.print("\tlabel: ");
               String eLabel = userInput.nextLine();
               System.out.print("\ta: ");
               Double eSideA = Double.parseDouble(userInput.nextLine());
               System.out.print("\tb: ");
               Double eSideB = Double.parseDouble(userInput.nextLine());
               System.out.print("\tc: ");
               Double eSideC = Double.parseDouble(userInput.nextLine());
            
               if (eList.findEllipsoid(eLabel) == null) {
                  System.out.println("\"" + eLabel + "\" not found\n");
               }
               else {
                  eList.editEllipsoid(eLabel, eSideA, eSideB, eSideC);
                  System.out.println("\"" + eLabel 
                     + "\" successfully edited\n");
               }
               break;
            case 'Q' :
               break;
            default:
               System.out.println("\t*** invalid code ***\n");
               break;
         }
      
      } while (!read.equalsIgnoreCase("Q"));
   
   
   }
}