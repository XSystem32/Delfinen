import java.util.*;

public class Chairman {

   private String username;
   private int password;
   
   public Chairman (String username, int password) {
      this.username = username;
      this.password = password;
   }
   
   public void setUsername(String username) {
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

   public void menuChairman(int log) {
         System.out.println("Welcome Chairman, choose option: ");
         switch (log) {
            case 1:
               //registration
               break;
            /*case 2:     hvis vi kan 
               //show members
               break;*/
         }
      }
   


}