import java.util.*;

public class Workers {
   
   private String username;
   private String password;
   private Boolean loggedIn;
   
   public Workers (String username, String password) {
      this.username = username;
      this.password = password;
   }
   
   public void setUsername(String username) {
      this.username = username;
   }
    
   public String getUsername() {
      return this.username; 
   }
   
   public void setPassword (String password) {
      this.password = password;
   }
   
   public String getPassword () {
      return this.password;
   }
   
   public void setLoggedIn (Boolean loggedIn) {
      this.loggedIn = loggedIn;
   }
   
   public Boolean getLoggedIn () {
      return loggedIn;
   }
   
}