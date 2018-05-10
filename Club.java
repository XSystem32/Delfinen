import java.util.ArrayList;

public class Club {

         ArrayList <String> users = new ArrayList<>();
         
         Coach coach = new Coach ("Coach", 123);
         Chairman chairman = new Chairman ("Chairman", 1234);
         Cashier cashier = new Cashier ("Cashier", 12345);
         
         public void Test() {
            System.out.println(users);
         }
      
      
}