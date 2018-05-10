import java.util.*;

public class Cashier {
   
   private String username;
   private int password;
   
   public Cashier (String username, int password) {
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
   
   public void menuCashier(int log) {
         System.out.println("Welcome Cashier, choose option: ");
         switch (log) {
            case 1:
               //show arrear members
               break;
            case 2:     //hvis vi kan 
               //change status paid/unpaid
               break;
         }
      }
   
}