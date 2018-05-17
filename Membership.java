import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Membership {
   
   Scanner scanner = new Scanner(System.in);
   private String name, sex, age, address, memberType;  
   private ArrayList<Member> members;
   private String filename;
   
   public Membership () {
      this.members = new ArrayList<Member>();
      this.filename = "members.txt";
      this.register();
      this.showMembers();
   }
   
   public void showMembers() {
      for (Member member : members) {
         System.out.println(member.toString());
      }
   }
   
   public boolean registerMember(String name, String sex, String age, String address, String memberType){
        try {
         FileWriter fw = new FileWriter(this.filename,true);
         fw.write("\n" + name + "," + sex + "," + age + "," + address + "," + memberType + ",");
         fw.close();
         Member member = new Member();
         member.setName(name);
         member.setSex(sex);
         member.setAge(age);
         member.setAddress(address);
         member.setmemberType(memberType);
         this.members.add(member);
      } catch (Exception e) {
         System.out.println("Could not save the user");
         return false;
      }
      
       return true;
   }
      
      /*for(int i = 0; i < this.members.size(); i++) {
         if (name.equals(this.members.get(i).getName())) {
            System.out.println("test");
            return false;
         }
      }*/
      public void register() {
 
         System.out.println("You are now about to register a member please: ");
         String name, sex, age, address, membertype = null;
         Scanner test = new Scanner (System.in);
            
         System.out.println("Enter Name:");
         name = test.nextLine();
         
         System.out.println("Enter Sex:");
         sex = test.nextLine();
          
         System.out.println("Enter Age:");
         age = test.nextLine();
          
         System.out.println("Enter Address:");
         address = test.nextLine();
          
         System.out.println("Enter Member Type:");
         memberType = test.nextLine();
      
         if (this.registerMember(name, sex, age, address, memberType)) {
            System.out.println("You succesfully registered a member");
         } else {
            System.out.println("Member could not be registered - please try again");
         }
         
         
}

}