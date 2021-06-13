import java.util.Scanner;
/**
This program will exchange letters using objects in the String class
and encode a message based on user inputs.

@author Christian Polka
@version 06/09/2021
*/

public class MessageConverter {
/** 
Method to invoke changes in a string based on user input.

@param args command line not used.
*/

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
   //String object for the user input; initialized to an empty String.
      String message = "";
   //An int represting the type of output the user wants.
      int outputType;
   //String object for the converted message; initialized to an empty String.
      String result = "";
   
   
   //Request input from the user then get user input using the nestLine() method
   //of the Scanner class
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
   
      outputType = Integer.parseInt(userInput.nextLine());
   
   // Creating the method to match expected output from user input
   
      if (outputType == 0) { // as is
         result = message;
      }
      else if (outputType == 1) { // trimmed
         result = message.trim();
      }
      else if (outputType == 2) { // lower case
         result = message.toLowerCase();
      }
      else if (outputType == 3) { // upper case
         result = message.toUpperCase();
      }
      else if (outputType == 4) { // replace vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else if (outputType == 5) { // without first and last character
         result = message.substring(1, message.length() - 1);
      }
      else { // invalid input
         result = "Error: Invalid choice input.";
      }
   
      System.out.println("\n" + result);
   
   
   }


}