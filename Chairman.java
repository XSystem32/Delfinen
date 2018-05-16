import java.util.*;
import java.util.ArrayList;

public class Chairman extends Workers {

   Scanner scanner = new Scanner(System.in);
   private String name, sex, age, adress, memberType;  
   
   private ArrayList<Member> members;
   private String filename;
   
   public Chairman(String username, String password) 
   {
      super(username, password);
   }
      

   
   // Oprettelse af medlem
   
   public void registerMember(ArrayList<Member> memberArrayList){
      System.out.println("You are now about you register a member please - ");
      System.out.println("Enter Name:");
      name = scanner.next();
      
      System.out.println("Enter Sex:");
      sex = scanner.next();
       
      System.out.println("Enter Age:");
      age = scanner.next();
       
      System.out.println("Enter Address:");
      adress = scanner.next();
       
      System.out.println("Enter Member Type:");
      memberType = scanner.next();
  
      Member member = new Member(name, sex, age, adress, memberType);
      memberArrayList.add(member);
      
      System.out.println("Register complete");
   }   
 
   // skal have lavet en filewriter 
   
   /*public void menuChairman(int log) {
         System.out.println("Welcome Chairman, choose option: ");
         switch (log) {
            case 1:
               //registration
               break;
            case 2:     hvis vi kan 
               //show members
               break;
         }
      }*/
   


}
