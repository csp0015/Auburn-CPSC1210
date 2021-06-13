/**
This program displays someone's name, age, and gender, along with
calculations for age in minutes and centuries as well as 
max heart rate based on age and gender.

@author Christian Polka
@version 6/2/2021
*/

import java.util.Scanner;

public class AgeStatistics {

/**
Asks user for input of name, age, and gender

@param args command line arguments (not used)
*/

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
   
   //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
   
   //Prompt the user for their age:
      System.out.print ("Enter your age in years: ");
      ageInYears = userInput.nextInt();
   
   //Promp the user for their gender:
      System.out.print ("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
   
   //Convert age:
      System.out.println("\tYour age in minutes is "
         + ageInYears*525600 + " minutes.");
   
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears/100 + " centuries.");
   
   //Display max hear rate:
      System.out.print("Your max heart rate is ");
   
      if (gender == 1) {
         maxHeartRate = 209 - (0.7*ageInYears);
      }
      else {
         maxHeartRate = 214 - (0.8*ageInYears);
      
      
      }
   
      System.out.println(maxHeartRate + " beats per minute.");
   
   
   
   }


}