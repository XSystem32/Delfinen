import java.util.Scanner;
import java.util.*;

public class Login {
      
      public Boolean loggedIn = false;
      private ArrayList <Workers> workersArrayList = new ArrayList<>();
            
      Chairman chairman = new Chairman ("Chairman", "123");
      Cashier cashier = new Cashier ("Cashier", "1234");
      Coach coach = new Coach ("Coach", "12345");
      
      public void addWorker() {
         workersArrayList.add(chairman);
         workersArrayList.add(cashier);
         workersArrayList.add(coach);
      }
      
      Scanner scan = new Scanner (System.in);
      
      public Login() {
         this.addWorker();
         this.runLogin();
         
      }
      
      //her laver vi en general login system
      
      public void runLogin() {
      
         chairman.setLoggedIn(false);
         cashier.setLoggedIn(false);
         coach.setLoggedIn(false);
         
         boolean loginBoolean = true;
         String enterUsername;
         String enterPassword;
         
         while (loginBoolean == true) {
            System.out.println("Enter your username: ");
            enterUsername = scan.next();
            
            System.out.println("Enter your password: ");
            enterPassword = scan.next();
            
             System.out.println(workersArrayList);
            
            for (Workers workers : workersArrayList) {
            
               if (enterUsername.equals(workers.getUsername()) && enterPassword.equals(workers.getPassword())) {
                  
                  System.out.println ("You are logged in as " + workers.getUsername());
                  
                  loggedIn = true;
                  workers.setLoggedIn(true);
                  
                  loginBoolean = false;   
               } else {
                     System.out.println("Fuck you");
                  }
            
            }
         }
         
      }
            
}