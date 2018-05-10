import java.util.*;
import java.util.Scanner;

public class Menu extends Chairman {

      String enterUsername;
      String enterPassword;
      
            
      public Menu() {
         this.runLogin();
      }
     
      public void runLogin() {
         System.out.println("Please log in");
         Scanner scan = new Scanner(System.in);
         
         System.out.println("\nEnter username");
         String enterUsername = scan.nextLine();
         
         System.out.println("\nEnter your password");
         String enterPassword = scan.nextLine();
 
         System.out.println(scan);
         
      }
      
      public void validate(String getUsername, int getPassword) {
         if (enterUsername.equals(getUsername()) && enterPassword.equals(getPassword())) {
         System.out.println("Welcome ");
         }
      }
      
      
   
}