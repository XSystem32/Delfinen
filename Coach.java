import java.util.*;

public class Coach {
   
   private String username;
   private int password;
   
   public Coach (String username, int password) {
      this.username = username;
      this.password = password;
      }
      
   public void setUsername (String username) {
      this.username = username;
   }
   
   public String getUsername () {
      return this.username; 
   }
   
   public void setPassword (int password) {
      this.password = password;
   }
   
   public int getPassword () {
      return this.password;
   }

   public void menuCoach(int log) {
         System.out.println("Welcome Coach, choose option: ");
         switch (log) {
            case 1:
               //show last best results
               break;
            case 2:     
               //show to
               break;
         }
      }
   

   
}