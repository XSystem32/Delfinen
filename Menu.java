import java.util.*;
import java.util.Scanner;

public class Menu {
      
      
      
      public Menu() {
         this.runLogin();
      }
     
      public void runLogin() { 
         System.out.println("Please log in");
         Scanner scan = new Scanner(System.in);
         
         System.out.println("\nEnter username");
         String enterUsername = scan.nextLine();
         
         int enterPassword = scan.nextInt();
         System.out.println("Enter your password");
         
         System.out.println(scan);
      }
      
      public void validate(String username, int password) {
         if (enterUsername.equals(getUsername()) && enterPassword.equals(getPassword())) {
         System.out.println("Welcome ");
         }
      }
      
      
   
}