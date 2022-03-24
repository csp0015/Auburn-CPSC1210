import java.util.Scanner;
import java.util.ArrayList;


/**
Second class of activity 6 called TemperatureInfo. This class will read in
user input and create a list and display results using the Temperatures
class.

@author Christian Polka
@version 06/30/2021
*/

public class TemperatureInfo {

/**
Main method in TemperatureInfo class. This method will read user input to 
create a Temperatures ArrayList and create a menu to see various data.
@param args command line not used.
*/

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
   
      Temperatures temps = new Temperatures(tempsList);
   
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp,"  
            + " [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            case 'P':
               System.out.println(temps);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }


}