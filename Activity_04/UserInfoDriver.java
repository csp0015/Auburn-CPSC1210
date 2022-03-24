/**
Creating a class, UserInfoDriver, that will have a main method that 
creates two instances of UserInfo and invokes methods on these instances
of UserInfo and invokes methods on these instances.

@author Christian Polka
@version 06/17/2021
*/

public class UserInfoDriver {

/**
In the main method below, two instances of UserInfo are created and assigned
to variables user1 and user2 respectively. These instances are printed after
they are created. Then after several methods are called on instances, the
instances are called again.

@param args command line not used.
*/

   public static void main(String[] args) {
      
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
      
      
   }

}