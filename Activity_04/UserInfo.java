/**

This program will have multiple classes: one called UserIfo and 
another called UserInfoDriver which contains a main method that 
uses the first class.

@author Christian Polka
@version 06/16/2021
*/

public class UserInfo {
/** 
Set up the instance variables, constructor and method used in this program.
@param args command line not used.
*/

// instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;

   private static final int OFFLINE = 0, ONLINE = 1;

// constructor
/** 
Setting up the constructor and inputs needed for this class.
@param firstNameIn command line used.
@param lastNameIn command line used.
*/

   public UserInfo(String firstNameIn, String lastNameIn) {
   
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
/**
Setting up the toString.
@return command line used.
*/
   
   public String toString() {
   
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";   
      }
      else {
         output += "Online";
      }
      return output;
   }
     
   
// methods
/**
Creating the setter and getter functionality for location.
@param locationIn command line used.
*/

   public void setLocation(String locationIn) {
   
      location = locationIn;
   
   }
/**
Creating a setter for age.
@param ageIn command line used.
@return command line used.
*/

   public boolean setAge(int ageIn) {
   
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   
   }
   
/**
Creating method for get age.
@return command line used.
*/
   
   public int getAge() {
      return age;
   }
   
/**
Creating method for get location.
@return command line used.
*/
   public String getLocation() {
      return location;
   
   }
   
   
/**
Allow user to log on.
*/

   public void logOff() {
      status = OFFLINE;
   }   

/**
Allow user to log off.
*/

   public void logOn() {
      status = ONLINE;
   }

}