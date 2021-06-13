import java.util.Scanner;
import java.text.DecimalFormat;
/**
Program to accept coded event information as input that includes the date, 
time, price, discount, section, row, seat, followed by the
description of the event.

@author Christian Polka
@version 06/13/2021
*/

public class Event {
/**
Main method to extract data from event code entered from user.
@param args command line not used.
*/

   public static void main(String[] args) {
      String eventCode, eventCodeTrim, date, time, 
         discount, price, section, row,
         seat, eventDescription;
      double doublePrice, doublePayPrice, doubleDiscount, cost,
         prizeNumber;
      Scanner userInput = new Scanner(System.in);
      DecimalFormat currency = new DecimalFormat("$#,##0.00");
      DecimalFormat percentage = new DecimalFormat("#.##%");
      DecimalFormat prize = new DecimalFormat("####");
      
      //Prompt user for ticket code
      System.out.print("Enter your event code: ");
      eventCode = userInput.nextLine();
      
      //Trimming white spaces before and after event code
      eventCodeTrim = eventCode.trim();
      
      if (eventCodeTrim.length() < 26) {
      
         System.out.println("\nInvalid Event Code.");
         System.out.println("Event code must have at least 26 characters.");
      }
      else {
      //Trimming white spaces before and after event code
         eventCodeTrim = eventCode.trim();
         
         // Get date
         date = eventCodeTrim.substring(0, 2) + "/" 
            + eventCodeTrim.substring(2, 4) + "/" 
            + eventCodeTrim.substring(4, 8);
         
         // Get event
         eventDescription = eventCodeTrim.substring(25);
         
         // Get time
         time = eventCodeTrim.substring(8, 10) + ":" 
            + eventCodeTrim.substring(10, 12);
            
         //Get total price
         price = eventCodeTrim.substring(12, 15) + "." 
            + eventCodeTrim.substring(15, 17);
         doublePrice = Double.parseDouble(price);
         
         // Get discount
         discount = "0." + eventCodeTrim.substring(17, 19);
         doubleDiscount = Double.parseDouble(discount);
         
         // Calculate cost
         cost = doublePrice * (1 - doubleDiscount);
         
         // Get section number
         section = eventCodeTrim.substring(19, 21);
         
         // Get row number
         row = eventCodeTrim.substring(21, 23);
         
         // Get seat number
         seat = eventCodeTrim.substring(23, 25);
         
         // Get prize number
         prizeNumber = Math.random() * 10000;
         
         // Format output information
         System.out.println("\nEvent: " + eventDescription
            + "   Date: " + date + "   Time: " + time);
            
         System.out.println("Section: " + section + "   Row: " 
            + row + "   Seat: " + seat);
            
         System.out.println("Price: " + currency.format(doublePrice) 
            + "   Discount: " + percentage.format(doubleDiscount) 
            + "   Cost: " + currency.format(cost));
            
         System.out.println("Prize Number: " + prize.format(prizeNumber));
      }
      
      
      
      
         
         
   
   
   
   
   
   }

}