import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
      
   Scanner reg = new Scanner(System.in);
   String log = reg.nextLine();
   private Membership membership;
   private ArrayList<Member> members;
   
   public Menu() {
      this.menuChairman();
   }
   
   public void menuChairman() {
   
         //System.out.println ("Welcome Chairman, please choose an option: ");
         //System.out.println("1. Register member \n2. Show members");
         switch (log) {
            case "1":
               Membership membership = new Membership();
               break;
            case "2":
               for (int i = 0; i < members.size(); i++) {
                  System.out.println(members.get(i).getName());
               }         
               break;
         }
      }
    
}